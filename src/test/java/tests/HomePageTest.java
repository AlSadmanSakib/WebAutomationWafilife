package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.HomePage;
import utilities.ExtentFactory;

public class HomePageTest extends BaseDriver{
	 
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	
	public void startUrl() {
		
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>HomePage Process</b></p>")
						.assignAuthor("QA TEAM").assignDevice("Windows");
		
		PageDriver.getCurrentDriver().get(baseUrl);
		PageDriver.getCurrentDriver().manage().window().maximize();
	}
	
	@Test(priority = 0) 
	
	public void clickOnPublisher() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click  on Publisher</b></p>");
		HomePage homepage = new HomePage(childTest);
		
		homepage.clickOnPublisher();
		//Thread.sleep(10000);
	}
	
	@Test(priority = 1) 
	
	public void clickOnpublisherName() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click  on PublisherName</b></p>");
		HomePage homepage = new HomePage(childTest);
		
		homepage.clickOnpublisherName();
		//Thread.sleep(10000);
	}

	@Test(priority = 2) 

	public void clickOnSubjectনানাদেশওভ্রমণ() throws InterruptedException, IOException {
	childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click  on Subjectনানাদেশওভ্রমণ</b></p>");
	HomePage homepage = new HomePage(childTest);
	
	homepage.clickOnSubjectনানাদেশওভ্রমণ();
	//Thread.sleep(10000);
}
	
	@Test(priority = 3) 

	public void clickOnWriterশাকুরমজিদ() throws InterruptedException, IOException {
	childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click  on Writerশাকুরমজিদ</b></p>");
	HomePage homepage = new HomePage(childTest);
	
	homepage.clickOnWriterশাকুরমজিদ();
	//Thread.sleep(10000);
}
	
	@Test(priority = 4) 

	public void selectField() throws InterruptedException, IOException {
	childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>select field</b></p>");
	HomePage homepage = new HomePage(childTest);
	
	homepage.selectField();
	//Thread.sleep(10000);
}
	
	@Test(priority = 5) 

	public void clickOnBookফেরাউনেরগ্রাম() throws InterruptedException, IOException {
	childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click On Bookফেরাউনেরগ্রাম</b></p>");
	HomePage homepage = new HomePage(childTest);
	
	homepage.clickOnBookফেরাউনেরগ্রাম();
	//Thread.sleep(10000);
}
	
	@AfterClass
	public void afterClass() {
	report.flush();
}
}
