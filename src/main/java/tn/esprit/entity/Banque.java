package tn.esprit.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Banque implements Serializable{
@Id
private int id_banque;
private String adresse;
private String nom;
private String email;
private long telephone;

@OneToMany(cascade = CascadeType.ALL, mappedBy="banque_compte")
private List<Compte> comptes;

@OneToMany(cascade = CascadeType.ALL, mappedBy="banque_agence")
private List<Agence> agences;

@OneToMany(cascade = CascadeType.ALL, mappedBy="banque_packProduit")
private List<PackProduit> packProduits;

public Banque() {
	super();
	// TODO Auto-generated constructor stub
}

public Banque(int id_banque, String adresse, String nom, String email, long telephone) {
	super();
	this.id_banque = id_banque;
	this.adresse = adresse;
	this.nom = nom;
	this.email = email;
	this.telephone = telephone;
}

public int getId_banque() {
	return id_banque;
}

public void setId_banque(int id_banque) {
	this.id_banque = id_banque;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public long getTelephone() {
	return telephone;
}

public void setTelephone(long telephone) {
	this.telephone = telephone;
}

public List<Compte> getComptes() {
	return comptes;
}

public void setComptes(List<Compte> comptes) {
	this.comptes = comptes;
}

public List<Agence> getAgences() {
	return agences;
}

public void setAgences(List<Agence> agences) {
	this.agences = agences;
}

public List<PackProduit> getPackProduits() {
	return packProduits;
}

public void setPackProduits(List<PackProduit> packProduits) {
	this.packProduits = packProduits;
}


}
