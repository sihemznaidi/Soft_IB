package tn.esprit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Credit implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id_credit;
private float montant_mensuel;
private float montant_total;
@Temporal(TemporalType.DATE)
private Date date_debut;
private int duree;//nombre de mois

@OneToOne(mappedBy="credit")
private Client client;

public Credit() {
	super();
	// TODO Auto-generated constructor stub
}

public Credit(float montant_mensuel, float montant_total, Date date_debut, int duree) {
	super();
	this.montant_mensuel = montant_mensuel;
	this.montant_total = montant_total;
	this.date_debut = date_debut;
	this.duree = duree;
}

public int getId_credit() {
	return id_credit;
}

public void setId_credit(int id_credit) {
	this.id_credit = id_credit;
}

public float getMontant_mensuel() {
	return montant_mensuel;
}

public void setMontant_mensuel(float montant_mensuel) {
	this.montant_mensuel = montant_mensuel;
}

public float getMontant_total() {
	return montant_total;
}

public void setMontant_total(float montant_total) {
	this.montant_total = montant_total;
}

public Date getDate_debut() {
	return date_debut;
}

public void setDate_debut(Date date_debut) {
	this.date_debut = date_debut;
}

public int getDuree() {
	return duree;
}

public void setDuree(int duree) {
	this.duree = duree;
}

public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
}


}
