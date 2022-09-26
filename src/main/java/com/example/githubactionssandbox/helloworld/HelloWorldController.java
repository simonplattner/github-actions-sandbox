package com.example.githubactionssandbox.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping("/")
  public String getHelloWorld() {
    return "Hello ma dudes!";
  }
}
