package tn.esprit.service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
// import java.time.temporal.*;

import org.hibernate.query.criteria.internal.expression.function.CurrentDateFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entity.Credit;
import tn.esprit.repository.CreditRepository;
@Service
public class CreditServiceImpl implements ICreditService {
@Autowired
CreditRepository creditrep;
	@Override
	public List<Credit> retrieveAllCredits() {
		// TODO Auto-generated method stub
		return (List<Credit>)creditrep.findAll();
	}

	@Override
	public Credit addCredit(Credit u) {
		// TODO Auto-generated method stub
		return creditrep.save(u);
	}

	@Override
	public void deleteCredit(int id) {
		creditrep.deleteById(id);

	}

	@Override
	public Credit updateCredit(Credit u) {
		// TODO Auto-generated method stub
		return creditrep.save(u);
	}

	@Override
	public Credit retrieveCredit(int id) {
		// TODO Auto-generated method stub
		return creditrep.findById(id).get();
	}

	@Override
	public float sommeCréditsTotal() {
		// TODO Auto-generated method stub
		return creditrep.sommeCréditsTotal();
	}

	@Override
	public void sommeCréditsTotalParAnnee() {
		creditrep.sommeCréditsTotalParAnnee();
		
	}

	@Override
	public float sommeCréditsRestAPayer() {
		List<Credit> list=this.retrieveAllCredits();
		Date now = new Date(System.currentTimeMillis());
		float sommeRestAPayer=0;
		for(Credit c : list){
			Date date_debut=c.getDate_debut();
			int duree=c.getDuree();
			float montant_total=c.getMontant_total();
			float montant_mensuel=c.getMontant_mensuel();
			int diff=0;
			if(now.after(date_debut)  ){
			 int diffAn=now.getYear()-date_debut.getYear();
			 int diffmois=now.getMonth()-date_debut.getMonth();
			 if(diffmois>=0){
			  diff=(diffAn*12)+diffmois;
			 }
			 else{
				  diff=(diffAn*12)+(diffmois*(-1));
			 }
			}
	         int restDuree=duree-diff;
	         float restAPayer=restDuree*montant_mensuel;
	         sommeRestAPayer+=restAPayer;
		}
		return sommeRestAPayer;
	}

}
