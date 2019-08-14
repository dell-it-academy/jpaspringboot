package jpa.spring.jpaspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alo")
public class AloController {

    @GetMapping()
    public String alo() {
        return "Aloha!";
    }

    @GetMapping("/{nome}")
    public String alo(@PathVariable String nome) {
        return "Aloha " + nome;
    }
}