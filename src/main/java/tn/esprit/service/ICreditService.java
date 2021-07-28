package tn.esprit.service;

import java.util.List;

import tn.esprit.entity.Admin;
import tn.esprit.entity.Credit;

public interface ICreditService {
	public List<Credit> retrieveAllCredits();
	public Credit addCredit(Credit u);
	public void deleteCredit(int id);
	public Credit updateCredit(Credit u);
	public Credit retrieveCredit(int id);
	public float sommeCréditsTotal();
	public void sommeCréditsTotalParAnnee();
	public float sommeCréditsRestAPayer ();
}
