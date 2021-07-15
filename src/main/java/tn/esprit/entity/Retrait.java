package tn.esprit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("retrait")
public class Retrait extends Operation implements Serializable {

	public Retrait(int num, float montant, Date date) {
		super(num, montant, date);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
