package com.cigna.hra.activity;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cigna.hra.common.util.HttpClientUtils;

public class RewardTest {
	
	ApplicationContext ctx = null;
	
	//@Before
	public void beforeInit(){
		String[] locations = {"application-context.xml"};
        ctx = new ClassPathXmlApplicationContext(locations);
	}
	
	@Test
	public void AddTeamTest() throws Exception{
		String url = "http://localhost:8080/gu/activity/getActivityById";
		Map<String, String> params = new HashMap<String, String>();
		params.put("activityId", "1");
		String result = HttpClientUtils.postMethodRequest(url, params);
		System.out.println("result="+result);
	}
	
}
