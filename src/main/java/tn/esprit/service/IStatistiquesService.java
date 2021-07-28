package tn.esprit.service;

import java.util.Date;
import java.util.List;

import tn.esprit.entity.Compte;
import tn.esprit.entity.Operation;

public interface IStatistiquesService {
		public int nombreCompteCourant();//*JPQL compteRepository
		public int nombreCompteEpargne();//*JPQL compteRepository
		public float sommeCréditsTotal ();//*JPQL CreditRepository
		//public void sommeCréditsTotalParAnnee();//*JPQL CreditRepository probbbbbbbbbbbb
		public float sommeCréditsRestAPayer ();//creditServiceImpl
		public float moyenneSalaires();//*JPQL ClientRepository
		public void TMM(Date dateDebut,Date dateFin);
		public String TMM();
		public List<Compte> comptesPlusCréditeursParPeriode(Date dateDebut,Date dateFin);//JPQL oprep trait statser
		public List<Compte> comptesPlusCréditeurs();
		public List<Compte> comptesPlusDébiteursParPeriode(Date dateDebut,Date dateFin);//trait statser
		public List<Compte> comptesPlusDébiteurs();
		public float moyenneTransactionsParJour(Date jour);
		public float moyenneTransactions();
		public List<Operation> GetTransactionsParDate(Date datejour);
}
