package tn.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.Client;



@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {

}
