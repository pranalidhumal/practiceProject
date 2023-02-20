package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClasses.HomePage;
import PomClasses.SignInPage;



public class TestClass {


public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aksha\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driverTest = new ChromeDriver();
		driverTest.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		
		driverTest.get("https://www.amazon.in/");
		
		HomePage homepage = new HomePage(driverTest);
		homepage.sendsearchTab();
		homepage.clickOnsearchButton();
		homepage.clickOnSignin();
		
		SignInPage signin = new SignInPage(driverTest);
		signin.sendemailOrPhoneNumber1("pranali");
		signin.sendemailOrPhoneNumber();
		signin.clickOnContinue();
		signin.clickOnCreateacc();
		
}
}