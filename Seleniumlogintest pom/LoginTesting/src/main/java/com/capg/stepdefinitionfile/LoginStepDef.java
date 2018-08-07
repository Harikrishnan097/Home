package com.capg.stepdefinitionfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.capg.pagebeans.LoginTestingBeans;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {
	private WebDriver driver=null;
	
	private LoginTestingBeans pageBean;
	
	
	
	@Before
	public void beforestrart()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\srinivas\\selenium\\chromedriver.exe");
		
	}
	
	
	@Given("^Login page with username and password$")
	public void login_page_with_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		driver = new ChromeDriver();
		driver.get("http://localhost:4444/Loginweb/Login.html");
		driver.manage().window().maximize();
		pageBean= new LoginTestingBeans();
		PageFactory.initElements(driver, pageBean);
		
		
	}

	@When("^username and password equal$")
	public void username_and_password_equal() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		
		pageBean.setUname("krish");
		pageBean.setPwd("krish");
		String username = pageBean.getUname();
		String pass = pageBean.getPwd();
		pageBean.clickSubmit();
		if(username.equals(pass))
		{
			System.out.println("ok");
			
			
		}
		
		
		
	}

	@Then("^Display capgemini page$")
	public void display_capgemini_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

}
