package com.cg.project.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page2 {

	@FindBy(name = "options")
	public WebElement pdetails;
	
	@FindBy(name = "pname")
	public WebElement pname;
	
	@FindBy(name = "client")
	public WebElement client;
	
	@FindBy(name = "size")
	public WebElement size;
	
	@FindBy(name = "register")
	public WebElement register;

	public String getPdetails() {
		return pdetails.getAttribute("value");
	}

	public void setPdetails(String pdetails) {
		this.pdetails.sendKeys(pdetails);
	}

	public String getPname() {
		return pname.getAttribute("value");
	}

	public void setPname(String pname) {
		this.pname.sendKeys(pname);
	}

	public String getClient() {
		return client.getAttribute("value");
	}

	public void setClient(String client) {
		this.client.sendKeys(client);
	}
	public String getSize() {
		return size.getAttribute("value");
	}

	public void setSize(String size) {
		this.size.sendKeys(size); 
	}
	public void clickRegisterButton() {
		register.click();
	}
	
}
