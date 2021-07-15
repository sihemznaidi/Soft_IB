package tn.esprit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Agence implements Serializable {
@Id
private int num_agence;
private String adresse;
private String ville;
@Temporal(TemporalType.DATE)
private Date date_ouverture;

@ManyToOne
private Banque banque_agence;

public Agence() {
	super();
	// TODO Auto-generated constructor stub
}

public Agence(int num_agence, String adresse, String ville, Date date_ouverture) {
	super();
	this.num_agence = num_agence;
	this.adresse = adresse;
	this.ville = ville;
	this.date_ouverture = date_ouverture;
}

public int getNum_agence() {
	return num_agence;
}

public void setNum_agence(int num_agence) {
	this.num_agence = num_agence;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}

public Date getDate_ouverture() {
	return date_ouverture;
}

public void setDate_ouverture(Date date_ouverture) {
	this.date_ouverture = date_ouverture;
}

public Banque getBanque_agence() {
	return banque_agence;
}

public void setBanque_agence(Banque banque_agence) {
	this.banque_agence = banque_agence;
}


}
