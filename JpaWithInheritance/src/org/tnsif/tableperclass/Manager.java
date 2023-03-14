package org.tnsif.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Table(name="Manager")
@Inheritance
public class Manager extends Employee{
	private static final long serialVersionUID=1L;
	private Integer deptid;
    private String deptname;
    private Integer getdeptid;
    //getter and setter method
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public Integer getGetdeptid() {
		return getdeptid;
	}
	public void setGetdeptid(Integer getdeptid) {
		this.getdeptid = getdeptid;
	}
	@Override
	public String toString() {
		return "Manager [deptid=" + deptid + ", deptname=" + deptname + ", getdeptid=" + getdeptid + "]";
	}
    
    
}
