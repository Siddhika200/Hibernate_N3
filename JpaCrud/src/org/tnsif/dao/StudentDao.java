package org.tnsif.dao;

import org.tnsif.entities.Student;

public interface StudentDao {
	  //            (classname,object name)
   void addStudent(Student student);//Creation,persit
   Student getStudent(int rollno);//Retrive
   void updateStudent(Student student);//Update
   void removeStudent(Student student);//delete
   
   void beginTransaction();
   void commitTransaction();
   
}
