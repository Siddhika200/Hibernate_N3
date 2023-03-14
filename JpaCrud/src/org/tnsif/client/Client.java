package org.tnsif.client;
import java.util.Scanner;

import org.tnsif.entities.Student;
import org.tnsif.service.StudentService;
import org.tnsif.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl(); 
		Scanner s=new Scanner(System.in);
		Student s1=new Student();
		//add:
		System.out.println("Enter the rollno and name:");
		s1.setName(s.nextLine());
		s1.setRollno(s.nextInt());
		service.add(s1);
		System.out.println("Student added ");
		
		//update
		System.out.println("enter the rollno for update :");
		s1=service.get(s.nextInt());
		System.out.println("enter the name for update :");
		s1.setName(s.nextLine());
		service.update(s1);
		System.out.println("Updated ");
	}

}
