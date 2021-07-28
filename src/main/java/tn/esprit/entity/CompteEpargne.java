package tn.esprit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("compteEpargne")
public class CompteEpargne extends Compte implements Serializable {
	
private double taux;

public double getTaux() {
	return taux;
}

public void setTaux(double taux) {
	this.taux = taux;
}

public CompteEpargne() {
	super();
	// TODO Auto-generated constructor stub
}

public CompteEpargne(String num_compte, Date date_creation, float solde) {
	super(num_compte, date_creation, solde);
	// TODO Auto-generated constructor stub
}
public CompteEpargne(String num_compte, Date date_creation, float solde,double taux) {
	super(num_compte, date_creation, solde);
	this.taux = taux;
	// TODO Auto-generated constructor stub
}
public CompteEpargne(double taux) {
	super();
	this.taux = taux;
}

@Override
public String toString() {
	return "CompteEpargne [taux=" + taux + ", toString()=" + super.toString() + "]";
}

}
