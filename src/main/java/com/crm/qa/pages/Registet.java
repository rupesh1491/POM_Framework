package com.crm.qa.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Registet extends TestBase {
	
commonmethod page;
	
	private static final Logger log = LogManager.getLogger(LeavePage.class);

	
	public Registet(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='REGISTER']")
	WebElement register;
	
	@FindBy(name="firstName")
	WebElement firstname;
	
	@FindBy(name="lastName")
	WebElement lastname;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(name="address1")
	WebElement address1;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	
	@FindBy(name="postalCode")
	WebElement postalcode;
	
	@FindBy(name="country")
	WebElement countrydropdown;
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="confirmPassword")
	WebElement confirmPassword;
	
	@FindBy(name="submit")
	WebElement submotbutton;
	
	@FindBy(xpath="//*[contains(text(),'Information ')]")
	WebElement informationtext;
	
	
	public void clickregister() {
		register.click();
		log.info("click on registet");
	}
	
	
	public void enterfirstname(String firstnam) {
		entertext(firstname, firstnam);
		log.info("enter firstname");
	}
	
	
	public void enterlastname(String lastnam) {
		entertext(lastname, lastnam);
		log.info("enter last name");
	}
	
	public void enterephone(String phonetext) {
		entertext(phone, phonetext);
		log.info("enter phonenum");
	}
	
	public void enteraddress1(String Address) {
		entertext(address1, Address);
		log.info("enter address");
	}
	
	public void entrcity(String city1) {
		entertext(city, city1);
		log.info("enter city");
	}
	public void enterstate(String statetext) {
		entertext(state, statetext);
		log.info("enter state");
	}
	public void enterpostalcode(String postal) {
		entertext(postalcode, postal);
	}
	
	public void entercountrydd(String condd) {
		selectdropdown(countrydropdown, condd);
		log.info("select countryddd");
	}
	public void username(String usernametext) {
		entertext(username, usernametext);
		log.info("enter username");
	}
	
	public void password(String passwordtext) {
		entertext(password, passwordtext);
		log.info("enter password");
	}
	public void confirmpassword(String confirmpasstext) {
		entertext(confirmPassword, confirmpasstext);
		log.info("enter confirm");
	}
	
	public void clicksubmit() {
		submotbutton.submit();
		log.info("click  submit");
	}
	
	public void enter_dataonRegisterpage(String fname,String lname,String Phone,String address1,String city, String state,String postal, String condd,String usname, String pwd,String cnfpwd) {
		clickregister();
		enterfirstname(fname);
		enterlastname(lname);
		enterephone(Phone);
		enteraddress1(address1);
		entrcity(city);
		enterstate(state);
		enterpostalcode(postal);
		entercountrydd(condd);
		username(usname);
		password(pwd);
		confirmpassword(cnfpwd);
		clicksubmit();
		
		
	}
	

}
