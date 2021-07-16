package tn.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.Agence;

@Repository
public interface AgenceRepository extends CrudRepository<Agence, Integer>{

}
