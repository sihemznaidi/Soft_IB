package tn.esprit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entity.Intervention;
import tn.esprit.repository.InterventionRepository;
@Service
public class InterventionServiceImpl implements IInterventionService {
@Autowired
InterventionRepository interventionrep;
	@Override
	public List<Intervention> retrieveAllInterventions() {
		// TODO Auto-generated method stub
		return (List<Intervention>)interventionrep.findAll();
	}

	@Override
	public Intervention addIntervention(Intervention u) {
		// TODO Auto-generated method stub
		return interventionrep.save(u);
	}

	@Override
	public void deleteIntervention(int id) {
		interventionrep.deleteById(id);

	}

	@Override
	public Intervention updateIntervention(Intervention u) {
		// TODO Auto-generated method stub
		return interventionrep.save(u);
	}

	@Override
	public Intervention retrieveIntervention(int id) {
		// TODO Auto-generated method stub
		return interventionrep.findById(id).get();
	}

}
