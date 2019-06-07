package com.qwerty.springcloudconfigclient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringcloudConfigClientApplicationTests {

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Test
	public void contextLoads() {
		System.out.println("-------------------------------------------------------");
		System.out.println(webApplicationContext);
		System.out.println("-------------------------------------------------------");
		System.out.println(webApplicationContext.getBean("dataSource"));
		System.out.println("-------------------------------------------------------");
		System.out.println(webApplicationContext.getBean("oracleDataSource"));
		System.out.println("-------------------------------------------------------");
	}

}
