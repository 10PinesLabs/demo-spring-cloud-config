package com.Pines.demo;

import com.Pines.demo.config.Parametros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class DemoController {

  @Autowired
  private Parametros properties;

  @GetMapping("/hola")
  public String holaConfigurado(){
    return this.properties.getHola();
  }
}
