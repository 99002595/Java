package com.lts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lts.autowired.Rectangle;
import com.lts.autowired.ShapeFactory;
import com.lts.autowired.Triangle;
import com.lts.constr.Student;
import com.lts.foodwiring.FoodPanda;
import com.lts.setter.Employee;

@SpringBootApplication
public class Trial1Application implements CommandLineRunner {

	



	public static void main(String[] args) {
		SpringApplication.run(Trial1Application.class, args);
	}
	@Autowired
	ApplicationContext context;
	@Autowired
	Student std;
	@Autowired
	//Employee emp;
	FoodPanda food;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Employee employee=context.getBean("emplyoee",Employee.class);
		
		//System.out.println(emp);
		//System.out.println(tr);
		System.out.println(food.showMenu("Indian"));
		//
	}

}
