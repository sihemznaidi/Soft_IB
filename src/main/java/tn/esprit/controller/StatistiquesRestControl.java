package tn.esprit.controller;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.entity.Compte;
import tn.esprit.entity.Operation;
import tn.esprit.service.IAdminService;
import tn.esprit.service.IOperationService;
import tn.esprit.service.IStatistiquesService;

@RestController
public class StatistiquesRestControl {
@Autowired
IStatistiquesService statistiques;
@Autowired
IOperationService opser;
private static final Logger l = LogManager.getLogger(StatistiquesRestControl.class);

//http://localhost:8090/SpringMVC/servlet/nombreCompteParType
@GetMapping("/nombreCompteParType")
@ResponseBody
public void nombreCompteParType() {
	l.info("nombre de compte courant="+statistiques.nombreCompteCourant());
	l.info("nombre de compte epargne="+statistiques.nombreCompteEpargne());
}

//http://localhost:8090/SpringMVC/servlet/nombreCompteCourant
@GetMapping("/nombreCompteCourant")
@ResponseBody
public int nombreCompteCourant() {
	return statistiques.nombreCompteCourant();
}

//http://localhost:8090/SpringMVC/servlet/nombreCompteEpargne
@GetMapping("/nombreCompteEpargne")
@ResponseBody
public int nombreCompteEpargne() {
	return statistiques.nombreCompteEpargne();
}

//http://localhost:8090/SpringMVC/servlet/sommeCrédits
@GetMapping("/sommeCrédits")
@ResponseBody
public float sommeCrédits() {
	return statistiques.sommeCréditsTotal();
}

//http://localhost:8090/SpringMVC/servlet/sommeCréditsTotal
@GetMapping("/sommeCréditsTotal")
@ResponseBody
public float sommeCréditsTotal() {
	return statistiques.sommeCréditsTotal();
}

//http://localhost:8090/SpringMVC/servlet/sommeCréditsRestAPayer
@GetMapping("/sommeCréditsRestAPayer")
@ResponseBody
public float sommeCréditsRestAPayer() {
	return statistiques.sommeCréditsRestAPayer();
}

//http://localhost:8090/SpringMVC/servlet/moyenneSalaires
@GetMapping("/moyenneSalaires")
@ResponseBody
public float moyenneSalaires() {
	return statistiques.moyenneSalaires();
}

//http://localhost:8090/SpringMVC/servlet/GetMoyenneDesTransactions/{datejour}
@GetMapping("/GetMoyenneDesTransactions/{datejour}")
@ResponseBody
public float GetMoyenneDesTransactions(@PathVariable @DateTimeFormat(pattern="yyyy-mm-dd") Date datejour) {
	return opser.GetMoyenneDesTransactions(datejour);
}

//http://localhost:8090/SpringMVC/servlet/comptesPlusCréditeursParPeriode/{dateDebut}/{dateFin}
@GetMapping("/comptesPlusCréditeursParPeriode/{dateDebut}/{dateFin}")
@ResponseBody
public List<Compte> comptesPlusCréditeursParPeriode(@PathVariable("dateDebut") @DateTimeFormat(pattern="yyyy-mm-dd") Date dateDebut,@PathVariable("dateFin") @DateTimeFormat(pattern="yyyy-mm-dd") Date dateFin) {
	return statistiques.comptesPlusCréditeursParPeriode(dateDebut, dateFin);
}

//http://localhost:8090/SpringMVC/servlet/comptesPlusCréditeurs
@GetMapping("/comptesPlusCréditeurs")
@ResponseBody
public List<Compte> comptesPlusCréditeurs() {
	
	return statistiques.comptesPlusCréditeurs();
}
//http://localhost:8090/SpringMVC/servlet/comptesPlusDébiteurs
@GetMapping("/comptesPlusDébiteurs")
@ResponseBody
public List<Compte> comptesPlusDébiteurs() {
	return statistiques.comptesPlusDébiteurs();
}

//http://localhost:8090/SpringMVC/servlet/listOperationParCompteEtDates/{s}/{dateDebut}/{dateFin}
@GetMapping("/listOperationParCompteEtDates/{s}/{dateDebut}/{dateFin}")
@ResponseBody
public List<Operation> listOperationParCompteEtDates(@PathVariable("s") String s,@PathVariable("dateDebut") @DateTimeFormat(pattern="yyyy-mm-dd") Date dateDebut,@PathVariable("dateFin") @DateTimeFormat(pattern="yyyy-mm-dd") Date dateFin){
	return	opser.listOperationParCompteEtDates(s, dateDebut, dateFin);
		
	}

//http://localhost:8090/SpringMVC/servlet/listOperationParCompteEtDatesBetween/{dateDebut}/{dateFin}
@GetMapping("/listOperationParCompteEtDatesBetween/{dateDebut}/{dateFin}")
@ResponseBody
public List<Operation> listOperationParCompteEtDatesBetween(@PathVariable("dateDebut") @DateTimeFormat(pattern="yyyy-mm-dd") Date dateDebut,@PathVariable("dateFin") @DateTimeFormat(pattern="yyyy-mm-dd") Date dateFin){
	return	opser.findAllByDateBetween(dateDebut, dateFin);
		
	}

//http://localhost:8090/SpringMVC/servlet/comptesPlusDébiteursParPeriode/{dateDebut}/{dateFin}
@GetMapping("/comptesPlusDébiteursParPeriode/{dateDebut}/{dateFin}")
@ResponseBody
public List<Compte> comptesPlusDébiteursParPeriode(@PathVariable("dateDebut") @DateTimeFormat(pattern="yyyy-mm-dd") Date dateDebut,@PathVariable("dateFin") @DateTimeFormat(pattern="yyyy-mm-dd") Date dateFin) {
	return statistiques.comptesPlusDébiteursParPeriode(dateDebut, dateFin);
}

//http://localhost:8090/SpringMVC/servlet/GetTransactionsParDate/{datejour}
@GetMapping("/GetTransactionsParDate/{datejour}")
@ResponseBody
public List<Operation> GetTransactionsParDate(@PathVariable("datejour") @DateTimeFormat(pattern="yyyy-mm-dd") Date datejour){
	return statistiques.GetTransactionsParDate(datejour);
}

//http://localhost:8090/SpringMVC/servlet/moyenneTransactions
@GetMapping("/moyenneTransactions")
@ResponseBody
public float moyenneTransactions(){
	return statistiques.moyenneTransactions();
}

//http://localhost:8090/SpringMVC/servlet/TMM
@GetMapping("/TMM")

public String TMM(){
	return statistiques.TMM();
}
}
