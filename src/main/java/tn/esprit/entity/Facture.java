package tn.esprit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Facture implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int num_facture;
private float tva;
private String libelle_produit;
private String nom_entreprise;
private int quantite;
private float prix_unitaire;
private int duree;
private float montant_mensuel;
@Temporal(TemporalType.DATE)
private Date date_debut;

@ManyToOne
private Client client_facture;

public Facture() {
	super();
	// TODO Auto-generated constructor stub
}

public Facture(int num_facture, float tva, String libelle_produit, String nom_entreprise, int quantite,
		float prix_unitaire, int duree, float montant_mensuel, Date date_debut) {
	super();
	this.num_facture = num_facture;
	this.tva = tva;
	this.libelle_produit = libelle_produit;
	this.nom_entreprise = nom_entreprise;
	this.quantite = quantite;
	this.prix_unitaire = prix_unitaire;
	this.duree = duree;
	this.montant_mensuel = montant_mensuel;
	this.date_debut = date_debut;
}

public int getNum_facture() {
	return num_facture;
}

public void setNum_facture(int num_facture) {
	this.num_facture = num_facture;
}

public float getTva() {
	return tva;
}

public void setTva(float tva) {
	this.tva = tva;
}

public String getLibelle_produit() {
	return libelle_produit;
}

public void setLibelle_produit(String libelle_produit) {
	this.libelle_produit = libelle_produit;
}

public String getNom_entreprise() {
	return nom_entreprise;
}

public void setNom_entreprise(String nom_entreprise) {
	this.nom_entreprise = nom_entreprise;
}

public int getQuantite() {
	return quantite;
}

public void setQuantite(int quantite) {
	this.quantite = quantite;
}

public float getPrix_unitaire() {
	return prix_unitaire;
}

public void setPrix_unitaire(float prix_unitaire) {
	this.prix_unitaire = prix_unitaire;
}

public int getDuree() {
	return duree;
}

public void setDuree(int duree) {
	this.duree = duree;
}

public float getMontant_mensuel() {
	return montant_mensuel;
}

public void setMontant_mensuel(float montant_mensuel) {
	this.montant_mensuel = montant_mensuel;
}

public Date getDate_debut() {
	return date_debut;
}

public void setDate_debut(Date date_debut) {
	this.date_debut = date_debut;
}

public Client getClient_facture() {
	return client_facture;
}

public void setClient_facture(Client client_facture) {
	this.client_facture = client_facture;
}


}
