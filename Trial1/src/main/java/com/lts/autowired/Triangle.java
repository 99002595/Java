package com.lts.autowired;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {

	@Override
	public void calculateArea(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Area of triangle is");
		System.out.println(0.5*x*y);
	}

}
