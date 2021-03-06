package com.lts.constr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	String name;
	int sid;
	String department;
	Course course;
	
	@Autowired
	public Student(Course course) {
		
		this.course = course;
	}

	public String getName() {
		return name;
	}
	
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
	public int getSid() {
		return sid;
	}
	@Value("${student.sid}")
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public String getDepartment() {
		return department;
	}
	@Value("${student.department}")
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sid=" + sid + ", department=" + department + ", course=" + course + "]";
	}
	
	

}
