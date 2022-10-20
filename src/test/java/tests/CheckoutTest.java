package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.Checkout;
import utilities.ExtentFactory;

public class CheckoutTest extends BaseDriver{

	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	
	public void startUrl() {
		
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Checkout Process</b></p>")
						.assignAuthor("QA TEAM").assignDevice("Windows");
		PageDriver.getCurrentDriver().manage().window().maximize();
	}
	
@Test(priority = 0) 
	
	public void sendName() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Send Name</b></p>");
		Checkout checkout = new Checkout(childTest);
		
		checkout.sendName();
		//Thread.sleep(10000);
	}

@Test(priority = 1) 

public void sendNumber() throws InterruptedException, IOException {
	childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Send Number</b></p>");
	Checkout checkout = new Checkout(childTest);
	
	checkout.sendNumber();
	//Thread.sleep(10000);
}

@Test(priority = 2) 

public void sendEmail() throws InterruptedException, IOException {
	childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Send Email</b></p>");
	Checkout checkout = new Checkout(childTest);
	
	checkout.sendEmail();
	//Thread.sleep(10000);
}

@Test(priority = 3) 

public void selectState() throws InterruptedException, IOException {
	childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Select State</b></p>");
	Checkout checkout = new Checkout(childTest);
	
	checkout.selectState();
	//Thread.sleep(10000);
}

@Test(priority = 4) 

public void selectArea() throws InterruptedException, IOException {
	childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Select Area</b></p>");
	Checkout checkout = new Checkout(childTest);
	
	checkout.selectArea();
	//Thread.sleep(10000);
}

@Test(priority = 5) 

public void sendAddress() throws InterruptedException, IOException {
	childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Send Address</b></p>");
	Checkout checkout = new Checkout(childTest);
	
	checkout.sendAddress();
	//Thread.sleep(10000);
}



@AfterClass
public void afterClass() {
report.flush();
}
}
