package tn.esprit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entity.CarteBancaire;
import tn.esprit.repository.CarteBancaireRepository;
@Service
public class CarteBancaireImpl implements ICarteBancaireService {
@Autowired
CarteBancaireRepository carterep;
	@Override
	public List<CarteBancaire> retrieveAllCarteBancaires() {
		// TODO Auto-generated method stub
		return (List<CarteBancaire>) carterep.findAll();
	}

	@Override
	public CarteBancaire addCarteBancaire(CarteBancaire u) {
		// TODO Auto-generated method stub
		return carterep.save(u);
	}

	@Override
	public void deleteCarteBancaire(int id) {
		carterep.deleteById(id);

	}

	@Override
	public CarteBancaire updateCarteBancaire(CarteBancaire u) {
		// TODO Auto-generated method stub
		return carterep.save(u);
	}

	@Override
	public CarteBancaire retrieveCarteBancaire(int id) {
		// TODO Auto-generated method stub
		return carterep.findById(id).get();
	}

}
