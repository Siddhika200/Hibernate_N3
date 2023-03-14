package org.tnsif.dao;

import javax.persistence.EntityManager;

import org.tnsif.entities.Student;

public class StudentDaoImpl implements StudentDao {
	private EntityManager em;

	@Override
	public void addStudent(Student student) {
		em.persist(student);
		
	}
     //search
	@Override
	public Student getStudent(int rollno) {
		Student student=em.find(Student.class,rollno);
		return null;
	}
    //update
	@Override
	public void updateStudent(Student student) {
		em.merge(student);
	}
   //delete
	@Override
	public void removeStudent(Student student) {
		em.remove(student);
		
	}
    //starting transaction
	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}
    // stop transaction
	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

	public StudentDaoImpl() {
		em=JPAUtil.getEntityManager();
	}

}
