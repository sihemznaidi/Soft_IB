package tn.esprit.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.Compte;


@Repository
public interface CompteRepository extends CrudRepository<Compte, String>{

	
}
