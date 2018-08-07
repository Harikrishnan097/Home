package com.cg.project.stepdefinitions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cg.project.beans.Page;
import com.cg.project.beans.Page2;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinitions {
	
	public Page page;
	public Page2 page2;
	private ChromeDriver driver;
	@Before
	public void setupStepEnv() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Given("^user is on first page$")
	public void user_is_on_first_page() throws Throwable {
		driver.get("D:\\Practice\\Cucumber\\static\\Page.html");
	    page = PageFactory.initElements(driver,Page.class);
	}

	@Then("^user enters name$")
	public void user_enters_name() throws Throwable {
	  page.setName("Deepika");
	  }

	@Then("^user enters gender$")
	public void user_enters_gender() throws Throwable {
		By elements = By.name("gender");
		List<WebElement> radioButtons = driver.findElements(elements);
	WebElement radioBtn = radioButtons.get(1);
	radioBtn.click();
	/*for(WebElement radioButton : radioButtons) {
		if(radioButton.isSelected())
			System.out.println(radioButton.getAttribute("value"));
	}*/
	}

	@Then("^user enters email$")
	public void user_enters_email() throws Throwable {
	   page.setEmail("deepikachowdary707@gmail.com");
	}

	@Then("^user enters contact$")
	public void user_enters_contact() throws Throwable {
	  page.setContact("9542308427");
	}

	@Then("^user enters address$")
	public void user_enters_address() throws Throwable {
	   page.setAddress("Tallur");
	}

	@Then("^user enters city$")
	public void user_enters_city() throws Throwable {
	   page.setCity("Ongole");
	}

	@Then("^user enters state$")
	public void user_enters_state() throws Throwable {
		WebElement selectElement = driver.findElement(By.name("state"));
		Select select = new Select(selectElement);
		select.selectByVisibleText("Maharastra");
	}

	@Given("^user is on second page$")
	public void user_is_on_second_page() throws Throwable {
	 page.clickSubmitButton(); 
		Alert jsAlert = driver.switchTo().alert();
		if(jsAlert.getText().equals("validated"))
		{
			Thread.sleep(1000);
			jsAlert.accept();
			driver.navigate().to("D:\\Practice\\Cucumber\\static\\Page2.html");
			page2 = PageFactory.initElements(driver, Page2.class);
		}
		else
		{
			
		}
	}

	@Then("^user enters projectdetails$")
	public void user_enters_projectdetails() throws Throwable { 
		By elements = By.name("options");
		List<WebElement> checkboxes = driver.findElements(elements);
		WebElement radioBtn1 = checkboxes.get(1);
		radioBtn1.click();
		WebElement radioBtn2 = checkboxes.get(2);
		radioBtn2.click();
	}

	@Then("^user enters Project name$")
	public void user_enters_Project_name() throws Throwable {
	   page2.setPname("Casestudy"); 
	}

	@Then("^user enters Client name$")
	public void user_enters_Client_name() throws Throwable {
	    page2.setClient("Deepika");
	}

	@Then("^enters  Team Size$")
	public void enters_Team_Size() throws Throwable {
	   page2.setSize("3");
	   page2.clickRegisterButton();
	}
}
