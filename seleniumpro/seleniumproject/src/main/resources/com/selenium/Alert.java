package com.selenium;

import static org.junit.Assert.*;

import org.junit.Test;

public class Alert {

	
	WebDriver driver;
	@Test
	public void ExampleForAlert() throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver", "D:\\srinivas\\selenium\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://din66007746:8085/Selenium/Alert.html");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@onclick="+"'alertFunction()']")).click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	System.out.println("DOne");

}
