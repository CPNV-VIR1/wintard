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
    curl -i -X DELETE localhost:8080/potatoes/2
    */
    @DeleteMapping("/potatoes/{id}")
    void deletePotato(@PathVariable Long id){
        repository.deleteById(id);
    }
}
