package com.au.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.au.spring.model.Circle;
import com.au.spring.model.Triangle;

public class SpringMain {
	public static void main(String []arg) {
		System.out.println("Hello World");
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
		Triangle triangle = context.getBean(Triangle.class);
        Circle circle = context.getBean(Circle.class);

        System.out.println(triangle.getType());
        System.out.println(triangle.area());
        System.out.println(circle.getType());
        System.out.println(circle.area());
	}
}
