package tn.esprit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("versement")
public class Versement extends Operation implements Serializable {

	
	public Versement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Versement(int num, float montant, Date date) {
		super(num, montant, date);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
