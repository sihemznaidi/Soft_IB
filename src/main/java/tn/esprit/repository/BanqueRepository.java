package tn.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.Banque;

@Repository
public interface BanqueRepository extends CrudRepository<Banque, Integer>{

}
