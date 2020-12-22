package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("info")
public class controller {

  @GetMapping
  public String getInfo() {
    return "Spring in working condition, deployment worked!";
  }
}
