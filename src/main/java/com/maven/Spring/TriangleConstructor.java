package com.maven.Spring;

public class TriangleConstructor {
	
	private String type;
	private String height;
	
	TriangleConstructor(String type){
		this.type=type;
	}
	
	
	public TriangleConstructor(String type,String height) {
		// TODO Auto-generated constructor stub
		this.type=type;
		this.height=height;
		
	}

	public String getType() {
		return type;
	}
	
	public String getHeight() {
		return height;
	}
	
	
	public void draw(){
		System.out.println("THIS IS CONSTRUCTOR INJECTION "+getType()+getHeight() );
	}

	/*public void setType(String type) {
		this.type = type;
	}
	*/
	
	

}
