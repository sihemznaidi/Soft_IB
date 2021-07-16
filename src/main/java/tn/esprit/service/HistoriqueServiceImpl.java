package tn.esprit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entity.Historique;
import tn.esprit.repository.HistoriqueRepository;
@Service
public class HistoriqueServiceImpl implements IHistoriqueService {
@Autowired
HistoriqueRepository historiquerep;
	@Override
	public List<Historique> retrieveAllHistoriques() {
		// TODO Auto-generated method stub
		return (List<Historique>)historiquerep.findAll();
	}

	@Override
	public Historique addHistorique(Historique u) {
		// TODO Auto-generated method stub
		return historiquerep.save(u);
	}

	@Override
	public void deleteHistorique(int id) {
		historiquerep.deleteById(id);

	}

	@Override
	public Historique updateHistorique(Historique u) {
		// TODO Auto-generated method stub
		return historiquerep.save(u);
	}

	@Override
	public Historique retrieveHistorique(int id) {
		// TODO Auto-generated method stub
		return historiquerep.findById(id).get();
	}

}
