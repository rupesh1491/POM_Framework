package com.crm.qa.pages;

import java.time.Duration;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class LeavePage extends TestBase {
	
	commonmethod page;
	
	private static final Logger log = LogManager.getLogger(LeavePage.class);

	
	public LeavePage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='oxd-select-text-input']")
	WebElement leavedropdown;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement levaearrow;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement fromdate;
	
	@FindBy(xpath="(//input[@placeholder='yyyy-mm-dd'])[2]")
	WebElement todate;
	
	@FindBy(xpath="//*[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
	WebElement commenttext;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Applybutton;
	
	@FindBy(xpath="//div[contains(text(),'Select ')]")
	WebElement select;
	
	//div[contains(text(),'Select ')]
	
	public void selectleavetext(String leave) throws InterruptedException {
		//selectdropdown(leavedropdown, text);
		Thread.sleep(1000);
		levaearrow.sendKeys(leave);
		Thread.sleep(1000);	
		//Thread.sleep(100);
		levaearrow.sendKeys(Keys.ARROW_DOWN);
	//	Thread.sleep(100);
		levaearrow.sendKeys(Keys.ENTER);
		
		log.info("click");
		
		
	}
	
	public void selectleavedropdown(String leave1) throws InterruptedException {
		levaearrow.click();
		Thread.sleep(100);	
		//Thread.sleep(100);
		WebElement element=driver.findElement(By.xpath("//div[text()='"+ leave1 +"']"));
		Thread.sleep(100);	
		element.click();
		
		
	}
	public void enterfromdate(String text) {
		entertext(fromdate, text);
		fromdate.sendKeys(Keys.TAB);
	}
	public void entertodate(String text) throws InterruptedException {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(100));
		  wait.until(ExpectedConditions.visibilityOf(todate));
		entertext(todate, text);
	}
	
	public void entercommenttext(String text) {
		entertext(commenttext, text);
	}
	
	public void clickapplybutton() {
		clickbutton(Applybutton);
	}
	
	public void enterleavepagedata(String leave,String leave1, String fromdate,String todate,String commenttext) throws InterruptedException {
		selectleavetext(leave);
		selectleavedropdown(leave1);
		enterfromdate(fromdate);
		entertodate(todate);
		entercommenttext(commenttext);
		clickapplybutton();
		
	}

}
