package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	@FindBy(xpath = "//input[@type='text']")
	private WebElement SearchTab; 
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement SearchButton; 
	
	@FindBy(xpath = "//select[@aria-describedby='searchDropdownDescription']")
	private WebElement All; 
	
	@FindBy(xpath = "//span[text() ='Hello, sign in']")
	private WebElement Signin;

	private WebDriver driver;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	public void sendsearchTab() {
		SearchTab.sendKeys("kurtis");
	}
	public void clickOnsearchButton() {
		Actions act = new Actions(driver);
		SearchButton.click();
	}
    public void clickOnSignin() {
		Actions act = new Actions(driver);
        Signin.click();
    }
    public void sendAll() {
    	Select s = new Select(All);
    	s.selectByIndex(2);
    }

	
}
