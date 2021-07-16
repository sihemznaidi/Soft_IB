package tn.esprit.service;

import java.util.List;

import tn.esprit.entity.Intervention;
import tn.esprit.entity.PackProduit;

public interface IPackProduitService {
	public List<PackProduit> retrieveAllPackProduits();
	public PackProduit addPackProduit(PackProduit u);
	public void deletePackProduit(int id);
	public PackProduit updatePackProduit(PackProduit u);
	public PackProduit retrievePackProduit(int id);
}
