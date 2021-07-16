package tn.esprit.service;

import java.util.List;

import tn.esprit.entity.Banque;
import tn.esprit.entity.CarteBancaire;

public interface ICarteBancaireService {
	public List<CarteBancaire> retrieveAllCarteBancaires();
	public CarteBancaire addCarteBancaire(CarteBancaire u);
	public void deleteCarteBancaire(int id);
	public CarteBancaire updateCarteBancaire(CarteBancaire u);
	public CarteBancaire retrieveCarteBancaire(int id);
}
