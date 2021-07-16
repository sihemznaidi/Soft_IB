package tn.esprit.service;

import java.util.List;

import tn.esprit.entity.Agence;
import tn.esprit.entity.Banque;

public interface IAgenceService {
	public List<Agence> retrieveAllAgences();
	public Agence addAgence(Agence u);
	public void deleteAgence(int id);
	public Agence updateAgence(Agence u);
	public Agence retrieveAgence(int id);
}
