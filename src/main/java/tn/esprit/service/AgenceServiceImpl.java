package tn.esprit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entity.Agence;
import tn.esprit.repository.AgenceRepository;
@Service
public class AgenceServiceImpl implements IAgenceService {
@Autowired
AgenceRepository agencerep;
	@Override
	public List<Agence> retrieveAllAgences() {
		return (List<Agence>)agencerep.findAll();
	}

	@Override
	public Agence addAgence(Agence u) {
		return agencerep.save(u);
	}

	@Override
	public void deleteAgence(int id) {
		agencerep.deleteById(id);

	}

	@Override
	public Agence updateAgence(Agence u) {
		return agencerep.save(u);
	}

	@Override
	public Agence retrieveAgence(int id) {
		return agencerep.findById(id).get();
	}

}
