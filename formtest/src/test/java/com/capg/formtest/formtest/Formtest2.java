package com.capg.formtest.formtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Formtest2 {
WebDriver driver= null;
	@Test
	public void test() {
		//fail("Not yet implemented");
		  
		  try {
			  driver.get("http://localhost:4444/formweb/TextRead.html");
			  String txt= driver.findElement(By.id("text1")).getAttribute("value");
			  System.out.println(txt);
			assertEquals("Capgemini", txt);
			if(txt.equals("Capgemini")) {
				System.out.println("good");}
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
	}
	@Before
	public void beforeAction()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\srinivas\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		
	}
	@After
	public void afterAction()
	{
		
		//driver.close();
		
	}

}
