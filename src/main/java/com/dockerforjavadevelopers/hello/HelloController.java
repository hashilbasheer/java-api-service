package com.dockerforjavadevelopers.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public ResponseEntity<Map<String, String>> index() {
        Map<String, String> map = new HashMap<>();
        map.put("status", "success");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
  
}
