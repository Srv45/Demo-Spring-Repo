package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Company;
import com.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Employee e = context.getBean("emp",Employee.class);
		Company c = context.getBean("c",Company.class);

		System.out.println(e);
	}

}
