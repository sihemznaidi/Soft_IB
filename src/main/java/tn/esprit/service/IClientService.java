package tn.esprit.service;

import java.util.List;

import tn.esprit.entity.Client;
import tn.esprit.entity.Compte;

public interface IClientService {
	public List<Client> retrieveAllClients();
	public Client addClient(Client u);
	public void deleteClient(int id);
	public Client updateClient(Client u);
	public Client retrieveClient(int id);
	public float sommeSalaire();
}
