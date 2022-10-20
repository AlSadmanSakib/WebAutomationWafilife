package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utilities.CommonMethods;
import utilities.GetScreenShot;

public class Order extends CommonMethods{
ExtentTest test;
	
	
	public Order(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;	
	}
	
	@FindBy(xpath = "//button[@class=\"single_add_to_cart_button button alt \"]")
	public WebElement submitOrder;
	
	@FindBy(xpath = "//span[contains(text(),'অর্ডার সম্পন্ন করুন')]")
	public WebElement CompleteTheOrder;
	
public void clickOnOrder() throws IOException {
		
		test.info("click Order");
	
	try {
		if (submitOrder.isDisplayed()) {
			submitOrder.click();
			test.pass("<p style=\"color:green; font-size:13px\"><b>click on submitOrder.</b></p>");
			timeOut(5000);
			
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "OrderPass");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "OrderPass.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			
		}
	} catch (Exception e) {
		test.fail("<p style=\"color:red; font-size:13px\"><b>click on Order location not avialble.</b></p>");
		Throwable t = new InterruptedException("Exception");
		test.fail(t);
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "OrderFail");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "OrderFail.png";
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		Assert.assertTrue(submitOrder.isDisplayed());
		PageDriver.getCurrentDriver().quit();
	}
}

	public void clickOnCompleteTheOrder() throws IOException {
	
	test.info("click Order");

	try {
		if (CompleteTheOrder.isDisplayed()) {
			CompleteTheOrder.click();
			test.pass("<p style=\"color:green; font-size:13px\"><b>click on CompleteTheOrder.</b></p>");
			timeOut(5000);
		
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CompleteTheOrderPass");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "CompleteTheOrderPass.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		
		}
	} catch (Exception e) {
	test.fail("<p style=\"color:red; font-size:13px\"><b>click on CompleteTheOrder location not avialble.</b></p>");
	Throwable t = new InterruptedException("Exception");
	test.fail(t);
	@SuppressWarnings("unused")
	String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CompleteTheOrderFail");
	String dest = System.getProperty("user.dir") + "\\screenshots\\" + "CompleteTheOrderFail.png";
	test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	Assert.assertTrue(CompleteTheOrder.isDisplayed());
	PageDriver.getCurrentDriver().quit();
}
}
}
