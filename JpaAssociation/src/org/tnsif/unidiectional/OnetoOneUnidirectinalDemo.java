package org.tnsif.unidiectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OnetoOneUnidirectinalDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPU-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		//1 emp
		Employee emp1=new Employee();
		emp1.setEmpname("Shruti Salve");
		
		//2 emp
		Employee emp2=new Employee();
		emp2.setEmpname("Siddhika Ghule");
		
		//1 address
		Address a1=new Address();
		a1.setArea("amruthdham");
		a1.setCity("Nashik");
		a1.setPincode(422003);
		a1.setState("Maharatra");
		
		//2 address
		Address a2=new Address();
		a2.setArea("Ashwini nagar");
		a2.setCity("Nashik");
		a2.setPincode(422003);
		a2.setState("Maharatra");
		
		emp2.setAddress(a1);
		emp1.setAddress(a2);
		em.persist(emp1);
		em.persist(emp1);
		
		em.getTransaction().commit();
		System.out.println("Data added successfully");
		em.close();
		factory.close();
		   
	}

}
