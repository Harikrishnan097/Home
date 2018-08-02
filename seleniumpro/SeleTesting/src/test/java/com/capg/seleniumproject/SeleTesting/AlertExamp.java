package com.capg.seleniumproject.SeleTesting;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class AlertExamp {

	Logger logger = Logger.getLogger("AlertExamp.class");
	WebDriver driver;

	@Test
	public void ExampleForAlert() {

		try {
			//System.setProperty("webdriver.gecko.driver", "D:\\srinivas\\selenium\\geckodriver.exe");
			System.setProperty("webdriver.chrome.driver", "D:\\srinivas\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			// driver.get("http://localhost:4444/seleniumproject/Alert.html");
			//driver.get("http://www.google.co.in");
			//driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&switch_account=");
			
			driver.get("http://localhost:4444/seleniumproject/pizza.html");
			Thread.sleep(2000);
			// driver.findElement(By.xpath("//button[@onclick=" +
			// "'alertFunction()']")).click();

			// driver.get("https://www.google.com");

			//driver.findElement(By.id("ap_email")).sendKeys("dipyaman@gmail.com");

			//driver.findElement(By.name("btnK")).click();
			// Alert alert = driver.switchTo().alert();
			// System.out.println(alert.getText());
			// logger.info(""+alert.getText());
			// alert.accept();
			WebElement element=driver.findElement(By.id("sel"));
			Select se=new Select(element);
			se.selectByVisibleText("Tomato");
			se.selectByVisibleText("Panner");
			//To get all the options that are selected in the dropdown.
			List<WebElement> allSelectedOptions = se.getAllSelectedOptions();
			for (WebElement webElement : allSelectedOptions)
			{
			//System.out.println("You have selected ::"+ webElement.getText());
				logger.info(""+webElement.getText());
				
			}
					System.out.println("DOne");
			logger.info("done");
		} catch (Exception e) {

		} finally {

			// driver.close();

		}
	}
}
