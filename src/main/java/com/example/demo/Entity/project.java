package com.example.demo.Entity;

import org.springframework.stereotype.Component;

public class project {
	
	private int pid;
	private String pname;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public project() {
		System.out.println("project created");
	}
	@Override
	public String toString() {
		return "project [pid=" + pid + ", pname=" + pname + "]";
	}
	
	public void show() {
		System.out.println("student project");
	}
	
	

}
