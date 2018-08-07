package com.capg.pagebeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginTestingBeans {
    
	@FindBy(how=How.ID,id="username")
	WebElement uname;
	

	@FindBy(how=How.ID,id="password")
	WebElement pwd;
	

	@FindBy(how=How.ID,id="res")
	WebElement reset;
	

	@FindBy(how=How.ID,id="sub")
	WebElement submit;


	public String getUname() {
		return uname.getAttribute("value");
	}


	public void setUname(String uname) {
		this.uname.sendKeys(uname);
	}


	public String getPwd() {
		return pwd.getAttribute("value");
	}


	public void setPwd(String pwd) {
		this.pwd.sendKeys(pwd);
	}




	public void clickSubmit() {
		
		submit.click();
	}


	
	
	
}
