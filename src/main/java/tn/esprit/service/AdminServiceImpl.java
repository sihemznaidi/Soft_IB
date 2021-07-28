package tn.esprit.service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entity.Admin;
import tn.esprit.entity.Client;
import tn.esprit.entity.Compte;
import tn.esprit.entity.CompteCourant;
import tn.esprit.entity.CompteEpargne;
import tn.esprit.repository.AdminRepository;
import tn.esprit.repository.ClientRepository;
import tn.esprit.repository.CompteRepository;
import tn.esprit.repository.CreditRepository;
@Service
public class AdminServiceImpl implements IAdminService {
@Autowired
AdminRepository adminrep;

	@Override
	public List<Admin> retrieveAllAdmins() {
		return (List<Admin>)adminrep.findAll();
	}

	@Override
	public Admin addAdmin(Admin u) {
		return adminrep.save(u);
	}

	@Override
	public void deleteAdmin(int id) {
		adminrep.deleteById(id);
		
	}

	@Override
	public Admin updateAdmin(Admin u) {
		return adminrep.save(u);
	}

	@Override
	public Admin retrieveAdmin(int id) {
		return adminrep.findById(id).get();
	}



}
