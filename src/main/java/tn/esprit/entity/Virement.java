package tn.esprit.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("virement")
public class Virement extends Operation {

	public Virement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Virement(int num, float montant, Date date) {
		super(num, montant, date);
		// TODO Auto-generated constructor stub
	}

}
