package tn.esprit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entity.PackProduit;
import tn.esprit.repository.PackProduitRepository;
@Service
public class PackProduitServiceImpl implements IPackProduitService {
@Autowired
PackProduitRepository packrep;
	@Override
	public List<PackProduit> retrieveAllPackProduits() {
		// TODO Auto-generated method stub
		return ( List<PackProduit> )packrep.findAll();
	}

	@Override
	public PackProduit addPackProduit(PackProduit u) {
		// TODO Auto-generated method stub
		return packrep.save(u);
	}

	@Override
	public void deletePackProduit(int id) {
		// TODO Auto-generated method stub
		packrep.deleteById(id);
	}

	@Override
	public PackProduit updatePackProduit(PackProduit u) {
		// TODO Auto-generated method stub
		return packrep.save(u);
	}

	@Override
	public PackProduit retrievePackProduit(int id) {
		// TODO Auto-generated method stub
		return packrep.findById(id).get();
	}

}
