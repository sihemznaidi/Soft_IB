package tn.esprit.service;

import java.util.List;

import tn.esprit.entity.Facture;
import tn.esprit.entity.Historique;

public interface IHistoriqueService {
	public List<Historique> retrieveAllHistoriques();
	public Historique addHistorique(Historique u);
	public void deleteHistorique(int id);
	public Historique updateHistorique(Historique u);
	public Historique retrieveHistorique(int id);
}
