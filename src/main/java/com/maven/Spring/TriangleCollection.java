package com.maven.Spring;

import java.util.List;

public class TriangleCollection {
	
	List<Point> pointList;

	public List<Point> getPointList() {
		return pointList;
	}

	public void setPointList(List<Point> pointList) {
		this.pointList = pointList;
	}
	
	
	
	public void draw(){
		
		for(Point point:pointList){
			System.out.println(point.getX());
			System.out.println(point.getY());
		}
	}

}
