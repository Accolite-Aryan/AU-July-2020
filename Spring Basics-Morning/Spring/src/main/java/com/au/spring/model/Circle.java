package com.au.spring.model;

public class Circle implements Shape{
	private Point center;
	public String Type;
	private int radius;
	
	public Circle() {}
	
	public Circle(String Type,int radius, Point center)
	{
		this.setCenter(center);
		this.setType(Type);
		this.setRadius(radius);
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area()
	{
		return 3.14*radius*radius;
	}	
}
