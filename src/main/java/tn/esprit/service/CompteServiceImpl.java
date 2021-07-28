package tn.esprit.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entity.Compte;
import tn.esprit.repository.CompteRepository;
@Service
public class CompteServiceImpl implements ICompteService {
@Autowired
CompteRepository compterep;
	
	@Override
	public List<Compte> retrieveAllComptes() {
		return (List<Compte>)compterep.findAll();
	}

	@Override
	public Compte addCompte(Compte u) {
		return compterep.save(u);
	}

	@Override
	public void deleteCompte(String id) {
		compterep.deleteById(id);

	}

	@Override
	public Compte updateCompte(Compte u) {
		return compterep.save(u);
	}

	@Override
	public Compte retrieveCompte(String id) {
		return compterep.findById(id).get();
	}

	@Override
	public List<Compte> retreiveAllCompteASC() {
		// TODO Auto-generated method stub
		return compterep.retreiveAllCompteASC();
	}
	@Override
	public List<Compte> retreiveAllCompteDESC() {
		// TODO Auto-generated method stub
		return compterep.retreiveAllCompteDESC();
	}

	

}
