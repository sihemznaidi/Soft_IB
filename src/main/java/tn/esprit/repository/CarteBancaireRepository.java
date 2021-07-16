package tn.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.CarteBancaire;

@Repository
public interface CarteBancaireRepository extends CrudRepository<CarteBancaire, Integer>{

}
