package ch.cpnves.potatotally.Controllers;

import ch.cpnves.potatotally.Repositories.PotatoRepository;
import ch.cpnves.potatotally.Entities.Potato;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PotatoController {

    private final PotatoRepository repository;

    PotatoController(PotatoRepository repository){
        this.repository = repository;
    }

    /* curl sample :
    curl -i -X PUT localhost:8080/potatoes/2 ^
        -H "Content-type:application/json" ^
        -d "{\"name\": \"Estima\", \"usage\": \"Purée de pommes de terre\"}"
     */
    @PutMapping("/potatoes/{id}")
    Potato replacePotato(@RequestBody Potato newPotato, @PathVariable Long id) {
        return repository.findById(id)
                .map(potato -> {
                    potato.setName(newPotato.getName());
                    potato.setUsage(newPotato.getUsage());
                    return repository.save(potato);
                })
                .orElseGet(() -> {
                    newPotato.setId(id);
                    return repository.save(newPotato);
                });
    }
}
