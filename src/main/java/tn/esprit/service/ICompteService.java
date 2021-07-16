package tn.esprit.service;

import java.util.List;

import tn.esprit.entity.Compte;

public interface ICompteService {
	public List<Compte> retrieveAllComptes();
	public Compte addCompte(Compte u);
	public void deleteCompte(String id);
	public Compte updateCompte(Compte u);
	public Compte retrieveCompte(String id);
	
}
