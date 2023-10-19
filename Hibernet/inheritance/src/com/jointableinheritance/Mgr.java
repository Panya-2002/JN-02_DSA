package com.jointableinheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mgr")
public class Mgr extends Emp 
{
	
	private static final long serialVersionUID = 1L;
	private String deptname;

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
}
