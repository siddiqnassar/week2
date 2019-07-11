package com.pack.SpringDemo;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Resource resource=new ClassPathResource("Beans.xml");
    	BeanFactory factory = new XmlBeanFactory(resource);
    	Scanner sc=new Scanner(System.in);
    	System.out.println("----type one of following-----");
    	System.out.println("1.man");
    	System.out.println("2.woman");
    	System.out.println("Enter choice");
    	String op=sc.next();
    	
        Human obj = (Human) factory.getBean(op);
        
        System.out.println(obj);
;
    }
}
