package com.cg.demo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class M22_Student implements Serializable
{
	@Id
	private int uid;
	private String name;		
	
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		return "Student [Name : "+name+"\t UID : "+uid+"]";
	}

	private static final long serialVersionUID = 1L;

}
