package tn.esprit.service;

import java.util.List;

import tn.esprit.entity.Agence;
import tn.esprit.entity.Facture;

public interface IFactureService {
	public List<Facture> retrieveAllFactures();
	public Facture addFacture(Facture u);
	public void deleteFacture(int id);
	public Facture updateFacture(Facture u);
	public Facture retrieveFacture(int id);
}
