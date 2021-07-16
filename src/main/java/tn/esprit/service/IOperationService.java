package tn.esprit.service;

import java.util.List;

import tn.esprit.entity.Intervention;
import tn.esprit.entity.Operation;

public interface IOperationService {
	public List<Operation> retrieveAllOperations();
	public Operation addOperation(Operation u);
	public void deleteOperation(int id);
	public Operation updateOperation(Operation u);
	public Operation retrieveOperation(int id);
}
