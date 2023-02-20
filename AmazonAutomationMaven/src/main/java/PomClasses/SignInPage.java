package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

	@FindBy(xpath = "//input[@type='email']")
	private WebElement emailOrPhoneNumber;
	
	@FindBy(xpath = "//input[@id='continue']")
     private WebElement Continue;
	
	@FindBy(xpath = "//a[text()='Conditions of Use']")
	private WebElement ConditionsofUse;
	
	@FindBy(xpath = "//a[text()='Privacy Notice']")
	private WebElement PrivacyNotice;

	
	@FindBy(xpath = "//a[@id='createAccountSubmit']")
	private WebElement Createacc;

    private WebDriver driver;

	private Actions act;
	
	public SignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver = driver;
		act = new Actions(driver);
	}
	//String user->user
	public void sendemailOrPhoneNumber1(String user) {
		emailOrPhoneNumber.sendKeys(user);
	}
	
	public void sendemailOrPhoneNumber() {
		emailOrPhoneNumber.sendKeys("pranali06@gmail.com");
		Select s = new Select(emailOrPhoneNumber);
		s.selectByIndex(5);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(emailOrPhoneNumber));
		emailOrPhoneNumber.click();
	}
	
	public void clickOnContinue() {
     //Actions act = new Actions(driver);
		Continue.click();
		act.moveToElement(Continue).click().perform();
	}
	
	public void clickOnConditionsofUse() {
		ConditionsofUse.click();
	}
	
	public void clickOnPrivacyNotice() {
		PrivacyNotice.click();
	}
	
	public void clickOnCreateacc() {
		//Actions act = new Actions(driver);
		Createacc.click();
		act.moveToElement(Createacc).click().perform();
	}

	
	
	
}
