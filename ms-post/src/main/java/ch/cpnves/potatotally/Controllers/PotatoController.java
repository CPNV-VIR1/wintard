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
    curl -i -X POST localhost:8080/potatoes ^
        -H "Content-type:application/json" ^
        -d "{\"name\": \"Yukon Gold\", \"usage\": \"Pomme vapeur\"}"
    */
    @PostMapping("/potatoes")
    Potato newPotato(@RequestBody Potato newPotato){
        return repository.save(newPotato);
    }
}
