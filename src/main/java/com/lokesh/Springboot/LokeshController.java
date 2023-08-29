package com.lokesh.Springboot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class LokeshController {
  RestTemplate resttemplate = new RestTemplate();
  @RestController
  public class compare {
    @GetMapping("/")
    public String welcome() {
      return "Hi i am Lokesh!";
    }
    @GetMapping("/compare/{value}")
    public String comparetoHundred(@PathVariable int value) {
      String message = "Could not determine comparison";
      if (value > 100) {
        message = "Value is Greater than 100";
      } else {
        message = "Value is Smaller than or equal to 100";
      }
      return message;
    }
  }
}
