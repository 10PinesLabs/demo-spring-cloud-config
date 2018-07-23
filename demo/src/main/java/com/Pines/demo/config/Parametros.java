package com.Pines.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="demo")
@RefreshScope
public class Parametros {

  private String hola;

  public String getHola() {
    return hola;
  }

  public void setHola(String hola) {
    this.hola = hola;
  }
}
