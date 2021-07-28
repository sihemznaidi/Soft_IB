package tn.esprit.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.query.Param;

import tn.esprit.entity.Intervention;
import tn.esprit.entity.Operation;

public interface IOperationService {
	public List<Operation> retrieveAllOperations();
	public Operation addOperation(Operation u);
	public void deleteOperation(int id);
	public Operation updateOperation(Operation u);
	public Operation retrieveOperation(int id);
	
	public List<Operation> listOperationParCompte(String idcompte);
	public List<Operation> findAllByDateBetween(Date date1 ,Date date2);
	public List<Operation> listOperationParCompteEtDates(String idcompte,  Date date1 , Date date2);
	public float GetMoyenneDesTransactions(Date datejour);
}
