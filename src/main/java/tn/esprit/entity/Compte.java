package tn.esprit.entity;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_compte")
public class Compte implements Serializable,Comparable<Compte>{
@Id
private String num_compte;
@Temporal(TemporalType.DATE)
private Date date_creation;
private float solde;
//@Enumerated(EnumType.STRING)
//private TypeCompte type_compte;

@OneToMany(cascade = CascadeType.ALL, mappedBy="compte")
@JsonIgnore
private List<Operation> operations;

@ManyToOne
@JsonIgnore
private Client client_compte;

@OneToOne //relation unidirectionnelle
private Historique historique;

@ManyToOne
private Banque banque_compte;

@OneToOne
private CarteBancaire carteBancaire;


public CarteBancaire getCarteBancaire() {
	return carteBancaire;
}

@Override
public String toString() {
	return "num_compte=" + num_compte + ", date_creation=" + date_creation + ", solde=" + solde + "]";
}

public void setCarteBancaire(CarteBancaire carteBancaire) {
	this.carteBancaire = carteBancaire;
}

public Compte() {
	super();
	// TODO Auto-generated constructor stub
}

public Compte(String num_compte, Date date_creation, float solde) {
	super();
	this.num_compte = num_compte;
	this.date_creation = date_creation;
	this.solde = solde;
	//this.type_compte = type_compte;
}

public String getNum_compte() {
	return num_compte;
}

public void setNum_compte(String num_compte) {
	this.num_compte = num_compte;
}

public Date getDate_creation() {
	return date_creation;
}

public void setDate_creation(Date date_creation) {
	this.date_creation = date_creation;
}

public float getSolde() {
	return solde;
}

public void setSolde(float solde) {
	this.solde = solde;
}



public Client getClient_compte() {
	return client_compte;
}

public void setClient_compte(Client client_compte) {
	this.client_compte = client_compte;
}

public Historique getHistorique() {
	return historique;
}

public void setHistorique(Historique historique) {
	this.historique = historique;
}

public Banque getBanque_compte() {
	return banque_compte;
}

public void setBanque_compte(Banque banque_compte) {
	this.banque_compte = banque_compte;
}

public Compte(String num_compte, float solde) {
	super();
	this.num_compte = num_compte;
	this.solde = solde;
}

public Compte(String num_compte) {
	super();
	this.num_compte = num_compte;
}

@Override
public int compareTo(Compte o) {
	return (int)(o.getSolde()-this.solde);
	
//	return (int)( this.client_compte.getCredit().getMontant_total()-
//			o.getClient_compte().getCredit().getMontant_total());
}



}
