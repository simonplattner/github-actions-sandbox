package com.example.githubactionssandbox.helloworld;

import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  final BuildProperties buildProperties;

  public HelloWorldController(final BuildProperties buildProperties) {
    this.buildProperties = buildProperties;
  }

  @GetMapping("/")
  public String getHelloWorld() {
    return "Hello mes dudes! this is version " + buildProperties.getVersion();
  }
}
