package tn.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.PackProduit;

@Repository
public interface PackProduitRepository extends CrudRepository<PackProduit, Integer> {

}
