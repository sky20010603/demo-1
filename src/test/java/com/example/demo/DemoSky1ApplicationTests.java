package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.biz.bootbiz;



@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoSky1ApplicationTests {
	
	@Autowired
	private bootbiz biz;
	
	@Test
	public void findall() {
		biz.findall(1, 3);
	}

}
