package tn.esprit.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class PackProduit implements Serializable {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private int id;
private String type_pack;
private float reduction;
	
@ManyToOne
private Banque banque_packProduit;

public PackProduit() {
	super();
	// TODO Auto-generated constructor stub
}

public PackProduit(int id, String type_pack, float reduction) {
	super();
	this.id = id;
	this.type_pack = type_pack;
	this.reduction = reduction;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getType_pack() {
	return type_pack;
}

public void setType_pack(String type_pack) {
	this.type_pack = type_pack;
}

public float getReduction() {
	return reduction;
}

public void setReduction(float reduction) {
	this.reduction = reduction;
}

public Banque getBanque_packProduit() {
	return banque_packProduit;
}

public void setBanque_packProduit(Banque banque_packProduit) {
	this.banque_packProduit = banque_packProduit;
}


}
