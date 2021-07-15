package tn.esprit.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Intervention implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Enumerated(EnumType.STRING)
private TypeIntervention type_intervention;
@Column(nullable=true)
private String description;

@ManyToMany(cascade = CascadeType.ALL, mappedBy="interventions")
private List<Client> clients;

public Intervention() {
	super();
	// TODO Auto-generated constructor stub
}

public Intervention(int id, TypeIntervention type_intervention, String description) {
	super();
	this.id = id;
	this.type_intervention = type_intervention;
	this.description = description;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public TypeIntervention getType_intervention() {
	return type_intervention;
}

public void setType_intervention(TypeIntervention type_intervention) {
	this.type_intervention = type_intervention;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public List<Client> getClients() {
	return clients;
}

public void setClients(List<Client> clients) {
	this.clients = clients;
}


}
