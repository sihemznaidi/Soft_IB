package tn.esprit.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Client implements Serializable{
	//attributs
@Id
private int codeClient;
private String nom;
@Temporal(TemporalType.DATE)
private Date dateNaissance;
private String adresse;
private int telephone;
private String nationalite;
@Column(nullable=true)
private String travail;
@Column(nullable=true)
private float salaire;
@Enumerated(EnumType.STRING)
private Type type;

@OneToMany(cascade = CascadeType.ALL, mappedBy="client_facture")
private List<Facture> factures;

@ManyToMany(cascade = CascadeType.ALL)
private List<Intervention> interventions;

@OneToOne
private Credit credit;

@OneToOne
private Users user;

@OneToMany(cascade = CascadeType.ALL, mappedBy="client_compte",fetch=FetchType.EAGER)
private List<Compte> comptes;

public int getCodeClient() {
	return codeClient;
}

public void setCodeClient(int codeClient) {
	this.codeClient = codeClient;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public Date getDateNaissance() {
	return dateNaissance;
}

public void setDateNaissance(Date dateNaissance) {
	this.dateNaissance = dateNaissance;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public int getTelephone() {
	return telephone;
}

public void setTelephone(int telephone) {
	this.telephone = telephone;
}

public String getNationalite() {
	return nationalite;
}

public void setNationalite(String nationalite) {
	this.nationalite = nationalite;
}

public String getTravail() {
	return travail;
}

public void setTravail(String travail) {
	this.travail = travail;
}

public float getSalaire() {
	return salaire;
}

public void setSalaire(float salaire) {
	this.salaire = salaire;
}

public Type getType() {
	return type;
}

public void setType(Type type) {
	this.type = type;
}

public List<Facture> getFactures() {
	return factures;
}

public void setFactures(List<Facture> factures) {
	this.factures = factures;
}

public List<Intervention> getInterventions() {
	return interventions;
}

public void setInterventions(List<Intervention> interventions) {
	this.interventions = interventions;
}

public Credit getCredit() {
	return credit;
}

public void setCredit(Credit credit) {
	this.credit = credit;
}

public List<Compte> getComptes() {
	return comptes;
}

public void setComptes(List<Compte> comptes) {
	this.comptes = comptes;
}

public Client() {
	super();
	// TODO Auto-generated constructor stub
}

public Client(int codeClient, String nom, Date dateNaissance, String adresse, int telephone, String nationalite,
		String travail, float salaire, Type type) {
	super();
	this.codeClient = codeClient;
	this.nom = nom;
	this.dateNaissance = dateNaissance;
	this.adresse = adresse;
	this.telephone = telephone;
	this.nationalite = nationalite;
	this.travail = travail;
	this.salaire = salaire;
	this.type = type;
}

@Override
public String toString() {
	return "Client [codeClient=" + codeClient + ", nom=" + nom + ", dateNaissance=" + dateNaissance + ", adresse="
			+ adresse + ", telephone=" + telephone + ", nationalite=" + nationalite + ", travail=" + travail
			+ ", salaire=" + salaire + ", type=" + type + "]";
}



}


