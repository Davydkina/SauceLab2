package com;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstTest{
	
	private WebDriver driver;
	private String baseUrl;
	
	@Before
	
	public void setUp() throws Exception{
		driver = new FirefoxDriver();
		baseUrl = "http://google.com";
		
	}
	
	@Test
	
public void testTest1() throws Exception{
		
		driver.get(baseUrl);
		driver.close();
		
		
	}
	}
	
	
	
