package com.lts.autowired;
import org.springframework.stereotype.Component;

@Component("shape")

public class Rectangle implements Shape{

	@Override
	public void calculateArea(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle is");
		System.out.println(x*y);
	}

}
