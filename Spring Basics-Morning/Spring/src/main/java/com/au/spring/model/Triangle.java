package com.au.spring.model;

import java.util.Map;

public class Triangle implements Shape{
	public String Type;
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Map<Character, Point> pointMap;
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public Map<Character, Point> getPointMap() {
		return pointMap;
	}
	public void setPointMap(Map<Character, Point> pointMap) {
		this.pointMap = pointMap;
	}
	
	public double area()
	{
		return ((pointA.getX()*(pointB.getY() -pointC.getY()) + pointB.getX()*(pointC.getY() -pointA.getY()) + pointC.getX()*(pointA.getY()- pointB.getY()))/2);
	}	//Ax(By-Cy) + Bx(Cy−Ay) + Cx(Ay−By)  
		//				2
	
}
