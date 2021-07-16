package tn.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.Facture;

@Repository
public interface factureRepository extends CrudRepository<Facture, Integer> {

}
