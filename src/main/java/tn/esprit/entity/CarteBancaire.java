package tn.esprit.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CarteBancaire implements Serializable {
@Id
private int num_carte;
private int password;

@OneToOne(mappedBy="carteBancaire")
private Compte compte;

public CarteBancaire(int num_carte, int password) {
	super();
	this.num_carte = num_carte;
	this.password = password;
}

public int getNum_carte() {
	return num_carte;
}

public void setNum_carte(int num_carte) {
	this.num_carte = num_carte;
}

public int getPassword() {
	return password;
}

public void setPassword(int password) {
	this.password = password;
}

public Compte getCompte() {
	return compte;
}

public void setCompte(Compte compte) {
	this.compte = compte;
}


}
