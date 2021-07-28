package tn.esprit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("operation")
@DiscriminatorColumn(name="typeOperation")
public class Operation implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int num;
private float montant;
@Temporal(TemporalType.DATE)
@DateTimeFormat(pattern="yyyy-mm-dd")
private Date date;

@ManyToOne
private Compte compte;

@ManyToOne
private Historique historique;

public Operation() {
	super();
	// TODO Auto-generated constructor stub
}

public Operation(int num, float montant, Date date) {
	super();
	this.num = num;
	this.montant = montant;
	this.date = date;
}

public Historique getHistorique() {
	return historique;
}

public void setHistorique(Historique historique) {
	this.historique = historique;
}

public int getNum() {
	return num;
}

public void setNum(int num) {
	this.num = num;
}

public float getMontant() {
	return montant;
}

public void setMontant(float montant) {
	this.montant = montant;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public Compte getCompte() {
	return compte;
}

public void setCompte(Compte compte) {
	this.compte = compte;
}


}
