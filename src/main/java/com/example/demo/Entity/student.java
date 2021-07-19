package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Entity
public class student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
	
	private String sname;
	private String scity;
	

	
	
	
	public student(String sname, String scity, project po) {
		super();
		this.sname = sname;
		this.scity = scity;
	}

	public student() {
		//System.out.println("student created");
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}
	



	@Override
	public String toString() {
		return "student [ sname=" + sname + ", scity=" + scity + "]";
	}
	
	public void show() {
		System.out.println("Im a student");
	}
	
}
