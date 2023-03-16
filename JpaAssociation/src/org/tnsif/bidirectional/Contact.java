package org.tnsif.bidirectional;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Contact")
public class Contact implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    @Id
    private Long contactno;
    private String name;
    @OneToMany(mappedBy="contact" ,cascade=CascadeType.ALL)
    private Set<Person>person=new HashSet<Person>(0);
    //getter and setter
	public Long getContactno() {
		return contactno;
	}
	public void setContactno(Long contactno) {
		this.contactno = contactno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//Default Constructor
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Parametrized Constructor
	public Contact(Long contactno, String name) {
		super();
		this.contactno = contactno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Contact [contactno=" + contactno + ", name=" + name + "]";
	}
    
}
