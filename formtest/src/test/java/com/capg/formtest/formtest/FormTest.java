package com.capg.formtest.formtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormTest {
  WebDriver driver=null;
	@Test
	public void test() {
		
		try {
			driver.get("http://localhost:4444/formweb/ConferenceRegistartion.html");
			Thread.sleep(2000);
			driver.findElement(By.id("txtFirstName")).sendKeys("krishnan");
			driver.findElement(By.id("txtLastName")).sendKeys("krish");
			driver.findElement(By.id("txtEmail")).sendKeys("krish@gmail.com");
			driver.findElement(By.id("txtPhone")).sendKeys("9654123578");
			WebElement elem= driver.findElement(By.name("size"));
			Select sel= new Select(elem);
			sel.selectByVisibleText("3");
			driver.findElement(By.id("txtAddress1")).sendKeys("rstreet");
			driver.findElement(By.id("txtAddress2")).sendKeys("Tnagar");
			
			WebElement elem2= driver.findElement(By.name("city"));
			WebElement elem3= driver.findElement(By.name("state"));
			Select sel2= new Select(elem2);
			sel2.selectByVisibleText("Chennai");
			Select sel3= new Select(elem3);
			sel3.selectByVisibleText("Tamilnadu");
			
			driver.findElement(By.name("memberStatus" )).click();
			
			driver.findElement(By.linkText("Next")).click();
			Alert al =driver.switchTo().alert();
			al.accept();
			
			//driver.get("http://localhost:4444/formweb/PaymentDetails.html");
			Thread.sleep(2000);
			driver.findElement(By.id("txtCardholderName")).sendKeys("krishnan");
			driver.findElement(By.id("txtDebit")).sendKeys("5469874152");
			driver.findElement(By.id("txtCvv")).sendKeys("123");
			driver.findElement(By.id("txtMonth")).sendKeys("june");
			driver.findElement(By.id("txtYear")).sendKeys("2016");
			driver.findElement(By.id("btnPayment")).click();
			
			Alert alt =driver.switchTo().alert();
			alt.accept();
			assertEquals("Payment Details", driver.getTitle());
			
			
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
		
		driver.close();
		
	}

}
