package tn.esprit.service;

import java.util.Date;
import java.util.List;

import tn.esprit.entity.Admin;
import tn.esprit.entity.Client;
import tn.esprit.entity.Compte;

public interface IAdminService {
	public List<Admin> retrieveAllAdmins();
	public Admin addAdmin(Admin u);
	public void deleteAdmin(int id);
	public Admin updateAdmin(Admin u);
	public Admin retrieveAdmin(int id);
	
	
}
