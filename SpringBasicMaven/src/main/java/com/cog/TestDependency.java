package com.cog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDependency {
 public static void main(String[] args) {
	/*B b = new B(); 
	 
	A a = new A(b);*/
//	a.setB(b);
	
	 
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
	
	A a = (A) context.getBean("a");
	a.execute();
}
}
