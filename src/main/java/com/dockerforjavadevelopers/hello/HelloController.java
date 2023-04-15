package com.dockerforjavadevelopers.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class HelloController {
    @Value("${GITHUB_RUN_NUMBER}")
    private String githubRunNumber;

    @GetMapping("/")
    public String hello() {
        String response = "Hello World! GitHub run number: " + githubRunNumber;
        return response;
    }
}
