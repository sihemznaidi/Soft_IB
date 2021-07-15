package tn.esprit.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Admin implements Serializable{
@Id
private int id_admin;
private String nom;

//private String login;
//private String password;
@OneToOne
private Users user;


@OneToMany(cascade = CascadeType.ALL)
private Set<Client> clients;


public Admin() {
	super();
	// TODO Auto-generated constructor stub
}


public Admin(int id_admin) {
	super();
	this.id_admin = id_admin;
}


public int getId_admin() {
	return id_admin;
}


public void setId_admin(int id_admin) {
	this.id_admin = id_admin;
}


public Users getUser() {
	return user;
}


public void setUser(Users user) {
	this.user = user;
}


public Set<Client> getClients() {
	return clients;
}


public void setClients(Set<Client> clients) {
	this.clients = clients;
}


}
