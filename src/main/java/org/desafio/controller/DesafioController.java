package org.desafio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DesafioController {

        @GetMapping("/desafio")
        public String desafio() {
            return "Retorno do desafio!!!";
        }
}
