package tn.esprit.service;

import java.util.List;

import tn.esprit.entity.Historique;
import tn.esprit.entity.Intervention;

public interface IInterventionService {
	public List<Intervention> retrieveAllInterventions();
	public Intervention addIntervention(Intervention u);
	public void deleteIntervention(int id);
	public Intervention updateIntervention(Intervention u);
	public Intervention retrieveIntervention(int id);
}
