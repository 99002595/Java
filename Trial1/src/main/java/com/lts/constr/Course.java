package com.lts.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Course {
	String coursename;
	int price;
	public String getCoursename() {
		return coursename;
	}
	@Value("${student.course.name}")
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getPrice() {
		return price;
	}
	@Value("${student.course.price}")
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [coursename=" + coursename + ", price=" + price + "]";
	}
	
	

}
