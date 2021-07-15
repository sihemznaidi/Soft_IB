package tn.esprit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("compteCourant")
public class CompteCourant extends Compte implements Serializable {

	private double decouvert;

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteCourant(String num_compte, Date date_creation, float solde) {
		super(num_compte, date_creation, solde);
		// TODO Auto-generated constructor stub
	}
	public CompteCourant(String num_compte, Date date_creation, float solde,double decouvert) {
		super(num_compte, date_creation, solde);
		this.decouvert = decouvert;
		// TODO Auto-generated constructor stub
	}
	public CompteCourant(double decouvert) {
		super();
		this.decouvert = decouvert;
	}
	
}
