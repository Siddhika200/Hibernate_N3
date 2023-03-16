package org.tnsif.bidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyBidirectional {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPU-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Person p=new Person();
		p.setAdharno(23456789);
		p.setName("Shruti Salve");
	
		Person p1=new Person();
		p1.setAdharno(78679995);
		p1.setName("Siddhika Ghule");
	
		Contact c1=new Contact();
		c1.setContactno(1234234562L);
		c1.setName("PrePaid");
		
		Contact c2=new Contact();
		c2.setContactno(7457848484L);
		c2.setName("PostPaid");

		em.persist(p);
		em.persist(p1);
		
		
		
		em.getTransaction().commit();
		System.out.println("Data added successfully");
		em.close();
		factory.close();
	}

}
