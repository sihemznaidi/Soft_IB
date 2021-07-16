package tn.esprit.service;

import java.util.List;

import tn.esprit.entity.Banque;
import tn.esprit.entity.Client;

public interface IBanqueService {
	public List<Banque> retrieveAllBanques();
	public Banque addBanque(Banque u);
	public void deleteBanque(int id);
	public Banque updateBanque(Banque u);
	public Banque retrieveBanque(int id);
}
