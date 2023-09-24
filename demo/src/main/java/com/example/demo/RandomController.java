package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/random")
public class RandomController {
    @GetMapping
    public ResponseEntity<String> getRandomResponse() {
        boolean randomBoolean = new Random().nextBoolean();

        if (randomBoolean) {
            return ResponseEntity.ok("200 OK");
        } else {
            return ResponseEntity.badRequest().body("400 Bad Request");
        }
    }
}
