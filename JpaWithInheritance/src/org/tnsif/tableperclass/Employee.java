package org.tnsif.tableperclass;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Emp_store")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Employee implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	private Integer id;
	private String name;
	private Float Salary;
	//getter and setter method
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getSalary() {
		return Salary;
	}
	public void setSalary(Float salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}
	

}
