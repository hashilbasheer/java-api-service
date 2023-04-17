package com.dockerforjavadevelopers.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.conext.ApplicationContext;
import org.springframework.conext.annotation.ComponentScan;
import org.springframework.conext..annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {
  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(Application.class, args);
  }
}
