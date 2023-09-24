package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {
    @GetMapping
    public ResponseEntity<String> getInfo() {
        // You can include additional information in the response body if needed
        String message = "Info";
        return ResponseEntity.ok().body(message);
    }
}