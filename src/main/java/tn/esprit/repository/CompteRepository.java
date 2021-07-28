package tn.esprit.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.Compte;


@Repository
public interface CompteRepository extends CrudRepository<Compte, String>{

	@Query("select c from Compte c join c.client_compte client join client.credit ")
	public List<Compte> retrieveAllComptesAndClientsAndCredits();
	
	@Query("select c.num_compte,MAX(c.solde) from Compte c  ORDER BY c.solde ASC ")
	public Compte retreiveAllCompteAvecPlusGrandSolde(@Param("date") Date date);
	
	@Query("select c from Compte c  ORDER BY c.solde ASC ")
	public List<Compte> retreiveAllCompteASC();
	
	@Query("select c from Compte c  ORDER BY c.solde DESC ")
	public List<Compte> retreiveAllCompteDESC();
	
	@Query("select SUM(c.solde) from Compte c  ")
	public float sommeSoldeComptes();
	
	@Query(value="SELECT COUNT(*) FROM compte WHERE type_compte='compteCourant'", nativeQuery=true)
	public int nombreCompteCourant();
	
	@Query(value="SELECT COUNT(*) FROM compte WHERE type_compte='compteEpargne'", nativeQuery=true)
	public int nombreCompteEpargne();
}
//join c.operations op where op.date=:date