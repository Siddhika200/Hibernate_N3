package org.tnsif.joinedinheritance;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Citizen")
@Inheritance(strategy=InheritanceType.JOINED)
public class Citizen extends Student12{
	private Integer cardno;
	private String citizenType;
	private Integer passportno;
	
	public Integer getPassportno() {
		return passportno;
	}
	public void setPassportno(Integer passportno) {
		this.passportno = passportno;
	}
	//getter and setters method
	public Integer getCardno() {
		return cardno;
	}
	public void setCardno(Integer cardno) {
		this.cardno = cardno;
	}
	public String getCitizenType() {
		return citizenType;
	}
	public void setCitizenType(String citizenType) {
		this.citizenType = citizenType;
	}
	

}
