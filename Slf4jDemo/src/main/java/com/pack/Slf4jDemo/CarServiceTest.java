package com.pack.Slf4jDemo;

import org.junit.Test;

public class CarServiceTest {

	@Test
	public void test()
	{
		CarService service=new CarService();
		service.process("Servicing mycar");
	}
}
