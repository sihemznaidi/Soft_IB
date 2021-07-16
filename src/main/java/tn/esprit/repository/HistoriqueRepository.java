package tn.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.Historique;

@Repository
public interface HistoriqueRepository extends CrudRepository<Historique, Integer>{

}
