package com.maven.Spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TriangleBeanProcessor  implements InitializingBean,DisposableBean{
	private Point pointA;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	
	
	public void draw(){
		System.out.println("Afrer the afterPropertiesSet() is being called ");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("After Setting The Values");
		
	}

	public void destroy() throws Exception {
	//	System.out.println("Before the Destruction of the bean occurs");
		
	}
	
	public void myInit(){
		System.out.println("Same as afterProperties method but not tied with Spring");
	}
	
	public void myDestroy(){
		System.out.println("Same as destroy");
	}
	

}
