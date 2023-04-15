package com.dockerforjavadevelopers.hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public ResponseEntity<String> index() {
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
  
    
}
