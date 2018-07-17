package com.Pines.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RefreshScope
@RestController
public class DemoController {

  @Value("$(hola)")
  private String hola;

  @GetMapping("/hola")
  public String holaConfigurado(){
    return this.hola;
  }
}
