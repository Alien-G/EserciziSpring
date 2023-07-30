package Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ExerciseController2 {
    @GetMapping("/greeting")
    public ResponseEntity<String> greeting() {
        String message = "Good Afternoon!";
        return ResponseEntity.ok(message);

    }
}
