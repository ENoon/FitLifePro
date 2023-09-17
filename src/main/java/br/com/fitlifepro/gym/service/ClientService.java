package br.com.fitlifepro.gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.fitlifepro.gym.model.Client;

import br.com.fitlifepro.gym.repository.ClientRepository;

@Service
public class ClientService {

  @Autowired
  private ClientRepository action;

  public ResponseEntity<?> register(Client obj){
        return new ResponseEntity<>(action.save(obj), HttpStatus.CREATED);
  }

  
}
