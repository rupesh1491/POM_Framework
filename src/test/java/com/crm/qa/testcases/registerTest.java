package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LeavePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.Registet;
import com.crm.qa.util.TestUtil;

public class registerTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	LeavePage leavepage;
	Registet reg;
	String sheetName = "register";
	
	public registerTest(){
		super();
	}
	@DataProvider
	public Object[][] getleaveestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	

}
	@Test(dataProvider="getleaveestData")
	public void Register(String fname,String lname,String Phone,String address1,String city, String state, String postal,String condd,String usname, String pwd,String cnfpwd) throws InterruptedException {
		//homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		reg=new Registet();
		reg.enter_dataonRegisterpage(fname,lname,Phone,address1, city, state, postal,condd, usname, pwd,cnfpwd);
		
		
	
		
		
		
		
		
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
