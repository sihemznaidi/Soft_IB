package tn.esprit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entity.Banque;
import tn.esprit.repository.BanqueRepository;
@Service
public class BanqueServiceImpl implements IBanqueService {
@Autowired
BanqueRepository banquerep;
	@Override
	public List<Banque> retrieveAllBanques() {
		return (List<Banque>)banquerep.findAll();
	}

	@Override
	public Banque addBanque(Banque u) {
		return banquerep.save(u);
	}

	@Override
	public void deleteBanque(int id) {
		banquerep.deleteById(id);

	}

	@Override
	public Banque updateBanque(Banque u) {
		return banquerep.save(u);
	}

	@Override
	public Banque retrieveBanque(int id) {
		return banquerep.findById(id).get();
	}

}
