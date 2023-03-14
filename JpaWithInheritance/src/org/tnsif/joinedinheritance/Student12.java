package org.tnsif.joinedinheritance;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Student12")
@Inheritance(strategy=InheritanceType.JOINED)
public class Student12 implements Serializable {
	private static final long serialVersionUID=1L;
	@Id
    private Integer rollno;
    private String name;
    private Float percentage;
    //getter and setter method
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPercentage() {
		return percentage;
	}
	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}
    
    
}
