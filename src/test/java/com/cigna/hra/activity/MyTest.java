package com.cigna.hra.activity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:application-context.xml"})
public class MyTest {


	@Test
	public void testRandomName() throws Exception{
		System.out.println("Test...Test...");
	}

}
