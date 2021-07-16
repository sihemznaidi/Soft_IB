package tn.esprit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entity.Credit;
import tn.esprit.repository.CreditRepository;
@Service
public class CreditServiceImpl implements ICreditService {
@Autowired
CreditRepository creditrep;
	@Override
	public List<Credit> retrieveAllCredits() {
		// TODO Auto-generated method stub
		return (List<Credit>)creditrep.findAll();
	}

	@Override
	public Credit addCredit(Credit u) {
		// TODO Auto-generated method stub
		return creditrep.save(u);
	}

	@Override
	public void deleteCredit(int id) {
		creditrep.deleteById(id);

	}

	@Override
	public Credit updateCredit(Credit u) {
		// TODO Auto-generated method stub
		return creditrep.save(u);
	}

	@Override
	public Credit retrieveCredit(int id) {
		// TODO Auto-generated method stub
		return creditrep.findById(id).get();
	}

}
