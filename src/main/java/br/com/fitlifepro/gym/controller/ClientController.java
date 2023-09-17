package br.com.fitlifepro.gym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fitlifepro.gym.model.Client;
import br.com.fitlifepro.gym.service.ClientService;
import jakarta.validation.Valid;


@RestController
public class ClientController {

  @Autowired
  private ClientService service;

  @PostMapping("/cadastro")
  public ResponseEntity<?> register(@Valid @RequestBody Client obj){
    return service.register(obj);
  }
}
