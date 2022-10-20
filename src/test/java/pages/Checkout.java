package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import junit.framework.Assert;
import utilities.CommonMethods;
import utilities.GetScreenShot;

public class Checkout extends CommonMethods{
ExtentTest test;
	
	
	public Checkout(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;	
	}
	
	@FindBy(xpath = "//input[@id='billing_first_name']")
	public WebElement SendName;
	
	@FindBy(xpath = "//input[@id='billing_phone']")
	public WebElement SendNumber;
	
	@FindBy(xpath = "//input[@id='billing_email']")
	public WebElement sendEmail;
	
	@FindBy(xpath = "(//span[@class=\"select2-selection select2-selection--single\"])[1]")
	//span[@class=\"select2 select2-container select2-container--default select2-container--below\"]//span[@class=\"selection\"]
	public WebElement selectState;
	
	@FindBy(xpath = "//span[@class=\"select2-results\"]//ul//li[contains(text(),'Dinajpur')]")
	public WebElement ChoosenDistrict;
	
	@FindBy(xpath = "//select[@id='billing_area']")
	public WebElement SelectArea;
	
	@FindBy(xpath = "//textarea[@id='billing_address_1']")
	public WebElement sendAddress;
	
	@FindBy(xpath = "//input[@class=\"select2-search__field\"]")
	public WebElement SearchField;
	
public void sendName() throws IOException {
		
		test.info("send name");

	try {
		if (SendName.isDisplayed()) {
			sendText(SendName, "Sadman Sakib");
			//timeOut(10000);
			test.pass("<p style=\"color:green; font-size:13px\"><b>send name.</b></p>");
			timeOut(5000);
			
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SendNamePass");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SendNamePass.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			
		}
	} catch (Exception e) {
		test.fail("<p style=\"color:red; font-size:13px\"><b>SendName location not avialble.</b></p>");
		Throwable t = new InterruptedException("Exception");
		test.fail(t);
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SendNameFail");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SendNameFail.png";
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		Assert.assertTrue(SendName.isDisplayed());
		PageDriver.getCurrentDriver().quit();
	}
	}

	public void sendNumber() throws IOException {
	
	test.info("send number");

try {
	if (SendNumber.isDisplayed()) {
		sendText(SendNumber, "123456789");
		//timeOut(10000);
		test.pass("<p style=\"color:green; font-size:13px\"><b>send number.</b></p>");
		timeOut(5000);
		
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SendNumberPass");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SendNumberPass.png";
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		
	}
} catch (Exception e) {
	test.fail("<p style=\"color:red; font-size:13px\"><b>SendNumber location not avialble.</b></p>");
	Throwable t = new InterruptedException("Exception");
	test.fail(t);
	@SuppressWarnings("unused")
	String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SendNumberFail");
	String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SendNumberFail.png";
	test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	Assert.assertTrue(SendNumber.isDisplayed());
	PageDriver.getCurrentDriver().quit();
}
}
	
	public void sendEmail() throws IOException {
		
		test.info("send email");

	try {
		if (sendEmail.isDisplayed()) {
			sendText(sendEmail, "ehsanbd92@gmail.com");
			//timeOut(10000);
			test.pass("<p style=\"color:green; font-size:13px\"><b>send email.</b></p>");
			timeOut(5000);
			
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "sendEmailPass");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "sendEmailPass.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			
		}
	} catch (Exception e) {
		test.fail("<p style=\"color:red; font-size:13px\"><b>sendEmail location not avialble.</b></p>");
		Throwable t = new InterruptedException("Exception");
		test.fail(t);
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "sendEmailFail");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "sendEmailFail.png";
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		Assert.assertTrue(sendEmail.isDisplayed());
		PageDriver.getCurrentDriver().quit();
	}
	}
	
	public void selectState() throws IOException {
		
		test.info("select state");

	try {
		if (selectState.isDisplayed()) {
			selectState.click();
			//selectItemByIndex(selectState, 13);
			timeOut(4000);
			ChoosenDistrict.click();
			timeOut(4000);
			test.pass("<p style=\"color:green; font-size:13px\"><b>select state.</b></p>");
			timeOut(5000);
			
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "statePass");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "statePass.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			
		}
	} catch (Exception e) {
		test.fail("<p style=\"color:red; font-size:13px\"><b>state location not avialble.</b></p>");
		Throwable t = new InterruptedException("Exception");
		test.fail(t);
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "stateFail");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "stateFail.png";
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		Assert.assertTrue(selectState.isDisplayed());
		PageDriver.getCurrentDriver().quit();
	}
	}
	
	public void selectArea() throws IOException {
		
		test.info("select field");

	try {
		if (SelectArea.isDisplayed()) {
			selectItemByIndex(SelectArea, 8);
			timeOut(3000);
			test.pass("<p style=\"color:green; font-size:13px\"><b>select area.</b></p>");
			timeOut(5000);
			
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "areaPass");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "areaPass.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			
		}
	} catch (Exception e) {
		test.fail("<p style=\"color:red; font-size:13px\"><b>area location not avialble.</b></p>");
		Throwable t = new InterruptedException("Exception");
		test.fail(t);
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "areaFail");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "areaFail.png";
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		Assert.assertTrue(SelectArea.isDisplayed());
		PageDriver.getCurrentDriver().quit();
	}
	}
	
public void sendAddress() throws IOException {
		
		test.info("send address ");

	try {
		if (sendAddress.isDisplayed()) {
			sendText(sendAddress, "148/2 Fulbari, Dinajpur");
			//timeOut(10000);
			test.pass("<p style=\"color:green; font-size:13px\"><b>send name.</b></p>");
			timeOut(5000);
			
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SendNamePass");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SendNamePass.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			
		}
	} catch (Exception e) {
		test.fail("<p style=\"color:red; font-size:13px\"><b>SendName location not avialble.</b></p>");
		Throwable t = new InterruptedException("Exception");
		test.fail(t);
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SendNameFail");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SendNameFail.png";
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		Assert.assertTrue(sendAddress.isDisplayed());
		PageDriver.getCurrentDriver().quit();
	}
	}
}
