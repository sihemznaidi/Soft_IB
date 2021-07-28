package tn.esprit.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.Credit;

@Repository
public interface CreditRepository extends CrudRepository<Credit, Integer> {

	@Query("select SUM(c.montant_total) from Credit c")
	public float sommeCréditsTotal();
	
	@Query("select SUM(c.montant_total) from Credit c GROUP BY c.date_debut")
	public void sommeCréditsTotalParAnnee();
	
}
