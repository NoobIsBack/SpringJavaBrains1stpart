package com.maven.Spring;

public class TriangleWithInterface implements Shape {

	private Point pointA;

	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Triangle");
		System.out.println("This is Coding with interfaces look like ");
		System.out.println("PointA is "+pointA.getX()+pointA.getY());
	}

}
