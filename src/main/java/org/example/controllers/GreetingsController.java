package org.example.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping(path = "/greet")
    ResponseEntity<String> greet() {
        return new ResponseEntity<String>("Greetings!", HttpStatus.OK);
    }
}
