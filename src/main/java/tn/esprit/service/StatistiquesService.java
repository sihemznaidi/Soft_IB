package tn.esprit.service;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import tn.esprit.controller.StatistiquesRestControl;
import tn.esprit.entity.Client;
import tn.esprit.entity.Compte;
import tn.esprit.entity.CompteCourant;
import tn.esprit.entity.CompteEpargne;
import tn.esprit.entity.Operation;
import tn.esprit.entity.Versement;
import tn.esprit.repository.AdminRepository;
import tn.esprit.repository.ClientRepository;
import tn.esprit.repository.CompteRepository;
import tn.esprit.repository.CreditRepository;
import tn.esprit.repository.OperationRepository;
@Service
public class StatistiquesService implements IStatistiquesService {
	private static final Logger l = LogManager.getLogger(StatistiquesRestControl.class);
	@Autowired
	ICompteService compteService;
	@Autowired
	IClientService clientservice;
	@Autowired
	ICreditService creditservice;
	@Autowired
	CreditRepository creditrep;
	@Autowired
	IOperationService operationservice;
	@Autowired
	OperationRepository operationrep;
	@Autowired
	CompteRepository compterep;
	@Autowired
	ClientRepository clientrep;
	public double GetMoyenneDesTransactions(Date datejour) {
		
		return operationservice.GetMoyenneDesTransactions(datejour);
	}

		@Override
		public int nombreCompteCourant() {
//			int nbCompteCourant=0;
//			List<Compte> listc =compteService.retrieveAllComptes();
//			for(Compte c:listc){
//				if(c instanceof CompteCourant)
//					nbCompteCourant++;
//			}
//			return nbCompteCourant;
			return compterep.nombreCompteCourant();
		}
		
		@Override
		public int nombreCompteEpargne() {
//			int nbCompteEpargne=0;
//			List<Compte> listc =compteService.retrieveAllComptes();
//			for(Compte c:listc){
//				 if(c instanceof CompteEpargne)
//					nbCompteEpargne++;
//			}
//			return nbCompteEpargne;
			return compterep.nombreCompteEpargne();
		}

		@Override
		public float sommeCréditsTotal() {
			return creditservice.sommeCréditsTotal();
		}
		
		
		@Override
		public float sommeCréditsRestAPayer() {
			return creditservice.sommeCréditsRestAPayer();
		}

		@Override
		public float moyenneSalaires() {
			return clientrep.moyenneSalaires();
		}
		
		//test
		public List<Operation> listOperationParCompteEtDates(Date date1, Date date2){
		return	operationservice.findAllByDateBetween(date1, date2);
			
		}
		@Override
		public List<Compte> comptesPlusCréditeursParPeriode(Date dateDebut, Date dateFin) {
			List<Compte> list1=compteService.retrieveAllComptes();
			List<Compte> list2=new ArrayList<>();
			for(Compte c:list1){
				float solde=0;
				String num_compte=c.getNum_compte();
				Date date=c.getDate_creation();
			//	cc.setHistorique(c.getHistorique());
			//	cc.setBanque_compte(c.getBanque_compte());
			//	cc.setCarteBancaire(c.getCarteBancaire());
				List<Operation> listop=operationservice.listOperationParCompteEtDates(c.getNum_compte(), dateDebut, dateFin);
				for(Operation o:listop){
					//if(o instanceof Versement){
						solde+=o.getMontant();
					//}
					//else{
					//	solde-=o.getMontant();
					//}
				}
				Compte cc=new Compte(num_compte, solde);
				//c.setSolde(solde);
				//cc.setSolde(c.getSolde());
				list2.add(cc);
			}
			Collections.sort(list2);
			Collections.reverse(list2);
			return list2;
		}


		@Override
		public List<Compte> comptesPlusDébiteursParPeriode(Date dateDebut, Date dateFin) {
			List<Compte> list1=compteService.retrieveAllComptes();
			List<Compte> list2=new ArrayList<>();
			for(Compte c:list1){
				float solde=0;
				Compte cc=new Compte();
				cc.setNum_compte(c.getNum_compte());
				List<Operation> listop=operationservice.listOperationParCompteEtDates(c.getNum_compte(), dateDebut, dateFin);
				for(Operation o:listop){
					if(o instanceof Versement){
						solde+=o.getMontant();
					}
					else{
						solde-=o.getMontant();
					}
				}
				cc.setSolde(solde);
				list2.add(cc);
			}
			Collections.sort(list2);
			return list2;
		}


	

		@Override
		public float moyenneTransactionsParJour(Date jour) {			
			return operationservice.GetMoyenneDesTransactions(jour);
		}
		@Override
		public List<Operation> GetTransactionsParDate(Date datejour){
			return operationrep.GetTransactionsParDate(datejour);
		}
		@Override
		public void TMM(Date dateDebut, Date dateFin) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public List<Compte> comptesPlusCréditeurs() {
			
			return compteService.retreiveAllCompteDESC();
		}

		@Override
		public List<Compte> comptesPlusDébiteurs() {
			return compteService.retreiveAllCompteASC();
		}

		@Override
		public float moyenneTransactions() {
			List<Operation> list=operationservice.retrieveAllOperations();
			float somme=0;
			for(Operation o:list){
				if(o instanceof Versement){
					somme+=o.getMontant();
				}
				else{
					somme-=o.getMontant();
				}
			}
			return ( somme/list.size());
		}

		@Override
		public String TMM() {
			String TMM = "";
			Document doc = null;
			try {

				doc = Jsoup.connect("https://www.bct.gov.tn/bct/siteprod/tableau_statistique_a.jsp?params=PL203105").get();

			} catch (IOException e) {

				l.error(e.getStackTrace());
				e.printStackTrace();
			}

			Elements repositories = doc.getElementsByClass("t-right");

			l.info("INFO : +Element+ = " + repositories.get(41).text() + " ");
			TMM = repositories.get(41).text();
			TMM.replace(",", ".");
	//
//			for (Element repository : repositories) {
//				logger.info("INFO : Element = " + repository.text());
//			}

			return TMM;
		}

		

}
