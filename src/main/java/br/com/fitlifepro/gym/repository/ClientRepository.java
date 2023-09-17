package br.com.fitlifepro.gym.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.fitlifepro.gym.model.Client;

public interface ClientRepository extends CrudRepository<Client, Integer> {
  

}
