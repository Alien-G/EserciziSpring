package com.example.demo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ExerciseController4 {
    @GetMapping("/random")
    public ResponseEntity<String> getRandomResponse() {
        boolean isSuccess = new Random().nextBoolean();

        if (isSuccess) {
            return ResponseEntity.badRequest().body("Err");
        } else {
            return ResponseEntity.ok("Ok");
        }
    }
}
