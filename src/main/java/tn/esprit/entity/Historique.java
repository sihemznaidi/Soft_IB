package tn.esprit.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Historique implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
//@Enumerated(EnumType.STRING)
//private TypeOperation type_operation;
@Temporal(TemporalType.DATE)
private Date date;
private float montant;

@OneToMany(cascade = CascadeType.ALL, mappedBy="historique")
private List<Operation>  operations;


public Historique() {
	super();
	// TODO Auto-generated constructor stub
}
public Historique(int code_operation, TypeOperation type_operation, Date date, float montant) {
	super();
	this.id = code_operation;
	
	this.date = date;
	this.montant = montant;
}


public List<Operation> getOperations() {
	return operations;
}
public void setOperations(List<Operation> operations) {
	this.operations = operations;
}

public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public float getMontant() {
	return montant;
}
public void setMontant(float montant) {
	this.montant = montant;
}


}
