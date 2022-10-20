package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.Order;
import utilities.ExtentFactory;

public class OrderTest extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	
	public void startUrl() {
		
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Order Process</b></p>")
						.assignAuthor("QA TEAM").assignDevice("Windows");
		PageDriver.getCurrentDriver().manage().window().maximize();
	}
	
	@Test(priority = 0) 
	
	public void clickOnOrder() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click  on submitOrder</b></p>");
		Order order = new Order(childTest);
		
		order.clickOnOrder();
		//Thread.sleep(10000);
	}
	
@Test(priority = 1) 
	
	public void clickOnCompleteTheOrder() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click  on CompleteTheOrder</b></p>");
		Order order = new Order(childTest);
		
		order.clickOnCompleteTheOrder();
		//Thread.sleep(10000);
	}

@AfterClass
public void afterClass() {
report.flush();
}
}
