package tn.esprit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entity.Operation;
import tn.esprit.repository.OperationRepository;
@Service
public class OperationServiceImpl implements IOperationService {
@Autowired
OperationRepository operationrep;
	@Override
	public List<Operation> retrieveAllOperations() {
		// TODO Auto-generated method stub
		return (List<Operation>)operationrep.findAll();
	}

	@Override
	public Operation addOperation(Operation u) {
		// TODO Auto-generated method stub
		return operationrep.save(u);
	}

	@Override
	public void deleteOperation(int id) {
		operationrep.deleteById(id);

	}

	@Override
	public Operation updateOperation(Operation u) {
		// TODO Auto-generated method stub
		return operationrep.save(u);
	}

	@Override
	public Operation retrieveOperation(int id) {
		// TODO Auto-generated method stub
		return operationrep.findById(id).get();
	}

}
