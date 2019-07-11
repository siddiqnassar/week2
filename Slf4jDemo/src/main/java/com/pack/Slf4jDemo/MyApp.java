package com.pack.Slf4jDemo;

import org.slf4j.LoggerFactory;

public class MyApp {

	private static org.slf4j.Logger Logger = LoggerFactory.getLogger(MyApp.class);
	
	public static void main(String args[])
	{
		Logger.info("Hello World");
		int res=add(10,20);
		System.out.println("Result :"+res);
		
	}
	public static int add(int a,int b)
	{
		return a+b;
	}
}
