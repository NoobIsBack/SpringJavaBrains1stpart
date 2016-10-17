package com.maven.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.transform.TransformingClassLoader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
    	
    	//Triangle tri=new Triangle();
    	//there are two interface Beanfactory and ApplicationContext
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	Triangle tri=(Triangle)context.getBean("triangle");
    	tri.draw();
    	
    	//CONSTRUCTOR INJECTION
    	TriangleConstructor triCons=(TriangleConstructor)context.getBean("triangleConstructor");
    	triCons.draw();
    	
    	
    	
    	//ObjectINjection
    	TriangleObjectInjection triObject=(TriangleObjectInjection)context.getBean("triangleObjectInjection");
    	triObject.draw();
    	
    	
    	//Collection Injection
    	TriangleCollection triColl=(TriangleCollection)context.getBean("triangleCollection");
    	triColl.draw();
    	
    	//Autowiring By Name
    	TriangleAutoWireByName triAuto=(TriangleAutoWireByName)context.getBean("triangleAutoWireByName");
    	triAuto.draw();
    	
       // System.out.println( "Hello World!" );
    	
    	//call back funcitons where spring can be called to do things
    	AbstractApplicationContext absContext=new ClassPathXmlApplicationContext("spring.xml");
    	absContext.registerShutdownHook();   //this would register hook and when the app ends  the destroy would be called to destriy all the beans
    	TriangleBeanProcessor triAbs=(TriangleBeanProcessor)absContext.getBean("triangleBeanProcessor");
    	triAbs.draw();
    	
    	//call back fucntions same as above but not coupled with SPRING
    	//same as above code
    	//Bean postProcessor
    	
    	///Coding with interfaces (real how we need to code to make it best)
    	
    	Shape sh=(Shape)context.getBean("circleWithInterface");
    	sh.draw();
    	Shape sp=(Shape)context.getBean("triangleWithInterface");
    	sp.draw();
    	
    	
    	
    }
}
