package testPack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomClasses.HomePage;
import PomClasses.SignInPage;

public class TestClass1 {

	
	private WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aksha\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
         driver.manage().window().maximize();
	}
	@BeforeMethod
	public void clickOnSignin() {
		System.out.println("Before Method");
		driver.get("https://www.amazon.in/");
		HomePage homepage = new HomePage(driver);
		homepage.clickOnSignin();

	}
	@Test
	public  void verifyConditionsofUseLink() {
		System.out.println("Test - 1");
		SignInPage signinpage= new SignInPage(driver);
		signinpage.clickOnConditionsofUse();
		
		ArrayList<String>addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(0));
		
		String actualURL= driver.getCurrentUrl();
		String actualTitle= driver.getTitle();
		
		String expectedURL = "https://www.amazon.in/gp/help/customer/display.html/ref=ap_signin_notification_condition_of_use?ie=UTF8&nodeId=200545940";
		String expectedTitle = "Conditions of Use - Amazon Customer Service";
		
		if(actualURL.equals(expectedURL)&& actualTitle.equals(expectedTitle))
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED"); 
		}
}
	@Test
	public  void verifyPrivacyNoticeLink() {
		System.out.println("Test - 2");
		SignInPage signinpage= new SignInPage(driver);
		signinpage.clickOnPrivacyNotice();
		
		ArrayList<String>addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(0));
		
		String actualURL= driver.getCurrentUrl();
		String actualTitle= driver.getTitle();
		
		String expectedURL = "https://www.amazon.in/gp/help/customer/display.html/ref=ap_signin_notification_privacy_notice?ie=UTF8&nodeId=200534380";
		String expectedTitle = "Amazon.in Privacy Notice - Amazon Customer Service";
		
		if(actualURL.equals(expectedURL)&& actualTitle.equals(expectedTitle))
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED"); 
		}
	}
	
	@AfterMethod
	public void closedCurrentTab() {
		System.out.println("After method");
		//driver.close();
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(0));	
		//driver.close();

	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
		driver.quit();
	}

}


