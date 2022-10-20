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

public class HomePage extends CommonMethods{
	
	ExtentTest test;
	
	
	public HomePage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
		
	}
	
	@FindBy(xpath = "//span[contains(text(),'প্রকাশক')]")
	public WebElement Publisher;
	
	@FindBy(xpath = "//h3[contains(text(),'অন্যপ্রকাশ')]")
	public WebElement publisherName;
	
	@FindBy(xpath = "//div[@id='product_cat_str:নানাদেশ ও ভ্রমণ']")
	public WebElement Subjectনানাদেশওভ্রমণ;
	
	@FindBy(xpath = "//div[@id='product_cat_str:শাকুর মজিদ']")
	public WebElement Writerশাকুরমজিদ;
	
	@FindBy(xpath = "//select[@class=\"select_field\"]")
	public WebElement selectField;
	
	@FindBy(xpath = "//div[@class=\"product-image-front\"]//img[@title=\"ফেরাউনের-গ্রাম\"]")
	public WebElement Bookফেরাউনেরগ্রাম;
	
	
	public void clickOnPublisher() throws IOException {
			
		test.info("click Publisher");
	
	try {
		if (Publisher.isDisplayed()) {
			timeOut(3000);
			Publisher.click();
			test.pass("<p style=\"color:green; font-size:13px\"><b>click on Publisher.</b></p>");
			timeOut(5000);
			
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "PublisherPass");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "PublisherPass.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			
		}
	} catch (Exception e) {
		test.fail("<p style=\"color:red; font-size:13px\"><b>click on Publisher location not avialble.</b></p>");
		Throwable t = new InterruptedException("Exception");
		test.fail(t);
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "PublisherFail");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "PublisherFail.png";
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		Assert.assertTrue(Publisher.isDisplayed());
		PageDriver.getCurrentDriver().quit();
	}
}
	
	public void clickOnpublisherName() throws IOException {
		
		test.info("click publisherName");
	
	try {
		if (publisherName.isDisplayed()) {
			publisherName.click();
			test.pass("<p style=\"color:green; font-size:13px\"><b>click on publisherName.</b></p>");
			timeOut(5000);
			
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "publisherNamePass");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "publisherNamePass.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			
		}
	} catch (Exception e) {
		test.fail("<p style=\"color:red; font-size:13px\"><b>click on publisherName location not avialble.</b></p>");
		Throwable t = new InterruptedException("Exception");
		test.fail(t);
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "publisherNameFail");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "publisherNameFail.png";
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		Assert.assertTrue(publisherName.isDisplayed());
		PageDriver.getCurrentDriver().quit();
	}
}
	
public void clickOnSubjectনানাদেশওভ্রমণ() throws IOException {
		
		test.info("click Subjectনানাদেশওভ্রমণ");
	
	try {
		if (Subjectনানাদেশওভ্রমণ.isDisplayed()) {
			Subjectনানাদেশওভ্রমণ.click();
			test.pass("<p style=\"color:green; font-size:13px\"><b>click on Subjectনানাদেশওভ্রমণ.</b></p>");
			timeOut(5000);
			
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "subejctPass");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "subejctPass.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			
		}
	} catch (Exception e) {
		test.fail("<p style=\"color:red; font-size:13px\"><b>click on Subjectনানাদেশওভ্রমণ location not avialble.</b></p>");
		Throwable t = new InterruptedException("Exception");
		test.fail(t);
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "subejctFail");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "subejctFail.png";
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		Assert.assertTrue(Subjectনানাদেশওভ্রমণ.isDisplayed());
		PageDriver.getCurrentDriver().quit();
	}
}

public void clickOnWriterশাকুরমজিদ() throws IOException {
	
	test.info("click Writerশাকুরমজিদ");

try {
	if (Writerশাকুরমজিদ.isDisplayed()) {
		Writerশাকুরমজিদ.click();
		test.pass("<p style=\"color:green; font-size:13px\"><b>click on Writerশাকুরমজিদ.</b></p>");
		timeOut(5000);
		
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "WriterPass");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "WriterPass.png";
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		
	}
} catch (Exception e) {
	test.fail("<p style=\"color:red; font-size:13px\"><b>click on Writerশাকুরমজিদ location not avialble.</b></p>");
	Throwable t = new InterruptedException("Exception");
	test.fail(t);
	@SuppressWarnings("unused")
	String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "WriterFail");
	String dest = System.getProperty("user.dir") + "\\screenshots\\" + "WriterFail.png";
	test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	Assert.assertTrue(Writerশাকুরমজিদ.isDisplayed());
	PageDriver.getCurrentDriver().quit();
}
}

public void selectField() throws IOException {
	
	test.info("select field");

try {
	if (selectField.isDisplayed()) {
		selectItemByIndex(selectField, 3);
		timeOut(3000);
		test.pass("<p style=\"color:green; font-size:13px\"><b>select field.</b></p>");
		timeOut(5000);
		
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "fieldPass");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "fieldPass.png";
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		
	}
} catch (Exception e) {
	test.fail("<p style=\"color:red; font-size:13px\"><b>field location not avialble.</b></p>");
	Throwable t = new InterruptedException("Exception");
	test.fail(t);
	@SuppressWarnings("unused")
	String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "fieldFail");
	String dest = System.getProperty("user.dir") + "\\screenshots\\" + "fieldFail.png";
	test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	Assert.assertTrue(selectField.isDisplayed());
	PageDriver.getCurrentDriver().quit();
}
}

public void clickOnBookফেরাউনেরগ্রাম() throws IOException {
	
	test.info("click Bookফেরাউনেরগ্রাম");

try {
	if (Bookফেরাউনেরগ্রাম.isDisplayed()) {
		Bookফেরাউনেরগ্রাম.click();
		test.pass("<p style=\"color:green; font-size:13px\"><b>click on Bookফেরাউনেরগ্রাম.</b></p>");
		timeOut(5000);
		
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Bookফেরাউনেরগ্রামPass");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Bookফেরাউনেরগ্রামPass.png";
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		
	}
} catch (Exception e) {
	test.fail("<p style=\"color:red; font-size:13px\"><b>click on Bookফেরাউনেরগ্রাম location not avialble.</b></p>");
	Throwable t = new InterruptedException("Exception");
	test.fail(t);
	@SuppressWarnings("unused")
	String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Bookফেরাউনেরগ্রামFail");
	String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Bookফেরাউনেরগ্রামFail.png";
	test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	Assert.assertTrue(Bookফেরাউনেরগ্রাম.isDisplayed());
	PageDriver.getCurrentDriver().quit();
}
}
}
