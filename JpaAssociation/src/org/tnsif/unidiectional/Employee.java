package org.tnsif.unidiectional;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
   private Integer empid;
   private String empname;
   @JoinColumn(name="Pincode")
   @OneToOne(cascade=CascadeType.ALL)
   private Address address;
   
//getter and setter method
   public Integer getEmpid() {
	return empid;
}

   public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

   public void setEmpid(Integer empid) {
	this.empid = empid;
}

   public String getEmpname() {
	return empname;
}

   public void setEmpname(String empname) {
	this.empname = empname;
}

  public Address getAddress() {
	return address;
}
//Default constructor
  public void setAddress(Address address) {
	this.address = address;
}
//parametrized constructor
   public Employee(Integer empid, String empname, Address address) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.address = address;
}

@Override
   public String toString() {
	return "Employee [empid=" + empid + ", empname=" + empname + ", address=" + address + "]";
}
   
   
}


