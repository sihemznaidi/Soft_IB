package tn.esprit.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Users implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id_user;
private String login;
private String password;
@OneToOne(mappedBy="user")
private Client client;
@OneToOne(mappedBy="user")
private Admin admin;
public int getId_user() {
	return id_user;
}
public void setId_user(int id_user) {
	this.id_user = id_user;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client = client;
}
public Admin getAdmin() {
	return admin;
}
public void setAdmin(Admin admin) {
	this.admin = admin;
}
public Users() {
	super();
	// TODO Auto-generated constructor stub
}
public Users( String login, String password) {
	super();
	this.login = login;
	this.password = password;
}


}
