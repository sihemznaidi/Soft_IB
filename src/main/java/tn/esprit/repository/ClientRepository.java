package tn.esprit.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.Client;



@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {
	@Query("select SUM(c.salaire) from Client c ")
	public float sommeSalaire();
	@Query("SELECT AVG(c.salaire) from Client c WHERE c.salaire>0 ")
	public float moyenneSalaires();
}
