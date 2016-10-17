package com.maven.Spring;

import org.springframework.beans.factory.annotation.Required;

public class CircleWithInterface implements Shape{
	
	private Point center;

	public void draw() {
		System.out.println("Circle");
		System.out.println("Coding with Interface Circle"+"X  "+center.getX()+"Y is "+center.getY());
		
	}

	public Point getCenter() {
		return center;
	}
   @Required
	public void setCenter(Point center) {
		this.center = center;
	}

}
