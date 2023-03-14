package org.tnsif.joinedinheritance;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.tnsif.tableperclass.Employee;
import org.tnsif.tableperclass.Manager;


public class JoinedInheritance {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPU-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		//1student
				Student12 e3=new Student12();
				e3.setRollno(161);
				e3.setPercentage(80.0f);
				e3.setName("Siddhika");
				em.persist(e3);
       //student2
				Student12 e4=new Student12();
				e3.setRollno(162);
				e3.setPercentage(85.0f);
				e3.setName("Pooja");
				em.persist(e4);
	//citizen
				Citizen m1=new Citizen();
				m1.setCardno(201);
				m1.setCitizenType("Mrunali Patil");
				m1.setPassportno(12345);
				em.persist(m1);
				em.getTransaction().commit();
		System.out.println("Data added successfully");
		em.close();
		factory.close();
		   
		
	}

}
