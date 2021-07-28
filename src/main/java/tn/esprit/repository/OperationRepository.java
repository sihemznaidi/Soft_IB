package tn.esprit.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.Compte;
import tn.esprit.entity.Operation;

@Repository
public interface OperationRepository extends CrudRepository<Operation, Integer>{

	@Query("select o from Operation o where o.compte.num_compte=:idcompte")
	public List<Operation> listOperationParCompte(@Param("idcompte") String idcompte);
	
	@Query("select o from Operation o where o.compte.num_compte=:idcompte and  o.date=:date ")
	public List<Operation> listOperationParCompteEtDate(@Param("idcompte") String idcompte,@Param("date") Date jour);
	

	
	@Query("SELECT e FROM Operation e WHERE e.compte.num_compte=:idcompte and e.date BETWEEN :date1 AND :date2 ")
	public List<Operation> listOperationParCompteEtDates(@Param("idcompte") String idcompte, @Param("date1") @DateTimeFormat(pattern="yyyy-mm-dd") Date date1 ,@Param("date2") @DateTimeFormat(pattern="yyyy-mm-dd") Date date2);
	//ou bien
	public List<Operation> findAllByDateBetween(Date date1 ,Date date2);
	
	@Query("select SUM(o.montant) from Operation o where o.date=:d")
	public float GetMoyenneDesTransactions(@Param("d")Date datejour);
	
	@Query("select o from Operation o where o.date=:d")
	public List<Operation> GetTransactionsParDate(@Param("d")Date datejour);
	
	
}
