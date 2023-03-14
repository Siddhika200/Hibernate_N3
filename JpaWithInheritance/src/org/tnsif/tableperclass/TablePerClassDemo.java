package org.tnsif.tableperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TablePerClassDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPU-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//1emp
		Employee e3=new Employee();
		e3.setId(161);
		e3.setName("siddhika ghule");
		e3.setSalary(35000.10f);
		em.persist(e3);
		
		//2emp
				Employee e4=new Employee();
				e3.setId(161);
				e3.setName("siddhika ghule");
				e3.setSalary(35000.10f);
				em.persist(e3);
				
		//1manager
				Manager m1=new Manager();
				m1.setId(201);
				m1.setName("Mrunali Patil");
				m1.setDeptid(45);
				m1.setDeptname("Finance");
				em.persist(m1);
				em.getTransaction().commit();
		System.out.println("Data added successfully");
		em.close();
		factory.close();
		
			
	}

}
