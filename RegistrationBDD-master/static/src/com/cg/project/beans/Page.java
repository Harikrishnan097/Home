package com.cg.project.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page {
	@FindBy(name="name")
	 public WebElement name;
	
	@FindBy(name="gender")
	public WebElement gender;
	
	@FindBy(name="email")
	public WebElement email;
	
	@FindBy(name="contact")
	public WebElement contact;
	
	@FindBy(name="address")
	public WebElement address;
	
	@FindBy(name="city")
	public WebElement city;
	
	@FindBy(name="state")
	public WebElement state;
	
	@FindBy(name="submit")
	public WebElement submit;

	public String getName() {
		return this.name.getAttribute("value");
	}

	public void setName(String name) {
		this.name.sendKeys(name);
	}

	public String getGender() {
		return this.gender.getAttribute("value");
	}

	public void setGender(String gender) {
		this.gender.sendKeys(gender);
	}

	public String getEmail() {
		return this.email.getAttribute("value");
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public String getContact() {
		return this.contact.getAttribute("value");
	}

	public void setContact(String contact) {
		this.contact.sendKeys(contact);
	}

	public String getAddress() {
		return this.address.getAttribute("value");
	}

	public void setAddress(String address) {
		this.address.sendKeys(address);
	}

	public String getCity() {
		return this.city.getAttribute("value");
	}

	public void setCity(String city) {
		this.city.sendKeys(city);;
	}

	public String getState() {
		return this.state.getAttribute("value");
	}

	public void setState(String state) {
		this.state.sendKeys(state);
	}
	
    public void clickSubmitButton() {
    	submit.click();
    }
}