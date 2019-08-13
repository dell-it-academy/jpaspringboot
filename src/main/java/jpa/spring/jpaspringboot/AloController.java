package jpa.spring.jpaspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AloController {

    @GetMapping("/alohaoha")
    public String alo() {
        return "Aloha!";
    }
}