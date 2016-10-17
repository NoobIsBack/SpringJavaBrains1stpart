package com.maven.Spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNamePostProcessor implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		//return null;
		System.out.println("After Initizaiolin bean name is "+ beanName);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Before Initizaiolin bean name is "+ beanName);
		return bean;
		//return null;
	}
	
	

}
