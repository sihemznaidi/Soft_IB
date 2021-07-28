package tn.esprit;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.entity.Compte;
import tn.esprit.entity.CompteCourant;
import tn.esprit.entity.CompteEpargne;
import tn.esprit.entity.Operation;
import tn.esprit.service.IAdminService;
import tn.esprit.service.ICompteService;
import tn.esprit.service.IOperationService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SoftIbApplicationTests {

	private static final Logger l = LogManager.getLogger(SoftIbApplicationTests.class);
	@Autowired
	ICompteService compteser;
	@Autowired
	IAdminService adminser;
	@Autowired
	IOperationService opser;
	@Test
	public void testComptesPlusCréditeurs(){
		Date d1=new Date("2021-07-01");
		Date d2=new Date("2021-07-08");
		//l.info(opser.findByDateBetween(d1,d2));
//		CompteCourant c1=new CompteCourant("1234",new Date(), 12540f);
//		CompteCourant c2=new CompteCourant("1234547",new Date(), 125650f);
//		CompteCourant c3=new CompteCourant("123474",new Date(), 125450f);
//		CompteEpargne c4=new CompteEpargne("12547", new Date(), 1445f);
//		CompteEpargne c5=new CompteEpargne("1254487", new Date(), 14574f);
//		CompteEpargne c6=new CompteEpargne("12787547", new Date(), 1458789f);
//		CompteCourant c7=new CompteCourant("34547",new Date(), 125f,12.5);
//		CompteCourant c8=new CompteCourant("474",new Date(), 450f,78.4);
//		CompteEpargne c9=new CompteEpargne("2547", new Date(), 691445f,4.6);
//		CompteEpargne c10=new CompteEpargne("5698", new Date(), 7814574f,2.9);
		/*compteser.addCompte(c7);
		compteser.addCompte(c8);
		compteser.addCompte(c9);
		compteser.addCompte(c10);
*/
	//	l.info("la somme des credits="+adminser.sommeCrédits());
//		l.info("------------------------crediteur----------------------------------");
//		List<Compte> lic=adminser.comptesPlusCréditeurs();
//		for(Compte c:lic){
//			if(c.getClient_compte()!=null){
//				if(c.getClient_compte().getCredit()!=null){
//					l.info("num client="+c.getClient_compte().getCodeClient()+" nom client="+c.getClient_compte().getNom()+"\n");
//					l.info("num compte="+c.getNum_compte()+" solde="+c.getSolde()+"\n");
//					l.info("solde du credit="+c.getClient_compte().getCredit().getMontant_total()+"\n");
//				}
//				else{
//					l.info("num client="+c.getClient_compte().getCodeClient()+" nom client="+c.getClient_compte().getNom()+"\n");
//					l.info("num compte="+c.getNum_compte()+" solde="+c.getSolde()+"\n");					
//				}
//			}
//			else{
//				l.info("num compte="+c.getNum_compte()+" solde="+c.getSolde()+"\n");					
//			}
//			l.info("*******");
//		}
//		l.info("------------------------debiteur----------------------------------");
//		List<Compte> lid=adminser.comptesPlusDébiteurs();
//		for(Compte c:lid){
//			if(c.getClient_compte()!=null){
//				if(c.getClient_compte().getCredit()!=null){
//			l.info("num client="+c.getClient_compte().getCodeClient()+" nom client="+c.getClient_compte().getNom()+"\n");
//			l.info("num compte="+c.getNum_compte()+" solde="+c.getSolde()+"\n");
//			l.info("solde du credit="+c.getClient_compte().getCredit().getMontant_total()+"\n");
//			//l.info("*******");
//				}
//				else{
//					l.info("num client="+c.getClient_compte().getCodeClient()+" nom client="+c.getClient_compte().getNom()+"\n");
//					l.info("num compte="+c.getNum_compte()+" solde="+c.getSolde()+"\n");
//				//	l.info("*******");
//					}
//			}
//			else{
//				l.info("num compte="+c.getNum_compte()+" solde="+c.getSolde()+"\n");	
//				//l.info("*******");
//				}
//			l.info("*******");
//		}
	}
	/*
	@Test
	public void testAjouterDepartement(){
		Departement e=new Departement("rh");
		Departement ed=new Departement("telecom");
		entser.ajouterDepartement(e);
		entser.ajouterDepartement(ed);
	}
	@Test
	public void testAffecterDepartementAEntreprise(){
		entser.affecterDepartementAEntreprise(1, 1);
		entser.affecterDepartementAEntreprise(2, 1);
		}
	
	@Test
	public void testAjouterEtaffecterDepartementEntreprise(){
		Departement d=new Departement("dep");
		Entreprise e=new Entreprise("orange","beja");
		entser.ajouterEtaffecterDepartementEntreprise(e, d);
		
	}
	
	@Test
	public void testGetAllDepartementsNamesByEntreprise(){
		List<String> ls=entser.getAllDepartementsNamesByEntreprise(1);
		l.info("les dep de l'entreprise 1 sont:"+ls);
		
	}*/
	////test employeSevice
	/*@Test
	public  void ajouterEmploye() {
		Employe e=new Employe( "sihem", "znaidi", "sihem@gmail.com", true, Role.administrateur);
		Employe e1=new Employe( "emna", "znaidi", "emna@gmail.com", true, Role.ChefDepartement);
		Employe e2=new Employe( "hejer", "znaidi", "hejer@gmail.com", true, Role.ingenieur);
    empser.ajouterEmploye(e);
    empser.ajouterEmploye(e1);
    empser.ajouterEmploye(e2);
	}
	@Test
	public void affecterEmployeADepartement() {
		empser.affecterEmployeADepartement(1, 1);
		empser.affecterEmployeADepartement(2, 1);
		empser.affecterEmployeADepartement(3, 2);
	}
	@Test
	public void ajouterContrat() {
		Contrat c=new Contrat(12345,new Date(), "CDD", 3000);
		Contrat c1=new Contrat(123174,new Date(), "CDI", 1000);
		empser.ajouterContrat(c);
		empser.ajouterContrat(c1);
	}
	@Test
	public void affecterContratAEmploye(){
		empser.affecterContratAEmploye(12345, 1);
		empser.affecterContratAEmploye(123174, 2);
	}
	@Test
	public void getEmployePrenomById(){
		l.info(empser.getEmployePrenomById(2));
	}
	@Test
	public void getNombreEmployeJPQL(){
		l.info(empser.getNombreEmployeJPQL());
	}
	@Test
	public void getAllEmployeNamesJPQL() {
		l.info(empser.getAllEmployeNamesJPQL());
	}
	@Test
	public void listemploye() {
		l.info(empser.listemploye());
	}
	
	@Test
	public void getallEmployebyEntreprise(){
		l.info(empser.getallEmployebyEntreprise(1));
	}
	@Test
	public void getEmploye(){
		l.info(empser.getEmploye("jihen","znaid"));
	}
	@Test
	public void mettreAjourEmailByEmployeId(){
		empser.mettreAjourEmailByEmployeId("xxxx@gmail.com", 2);
	}
		@Test
		public void affecterEmployeDepartement(){
			Employe e=new Employe( "jihen", "znaid", "jihen@gmail.com", true, Role.ingenieur);
			Departement d=new Departement("departementx");
			empser.affecterEmployeDepartement(e, d);
		}*/

}
