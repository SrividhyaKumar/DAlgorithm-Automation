package dsalgopages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Loginpage_pf 
{
	WebDriver driver;
	
	@FindBy (xpath = "//input[@name='username']") WebElement username;
	@FindBy (xpath = "//input[@name='password']") WebElement password;
	@FindBy (xpath = "//input[@type='submit']") WebElement login ;
	@FindBy (xpath = "//div[@role='alert']") WebElement invalidmessage;
	@FindBy (xpath = "//div[@role='alert']") WebElement successmessage;
	
	public Loginpage_pf(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void enterUsernamePassword(String username1, String password1) {
		
		username.sendKeys(username1);
		password.sendKeys(password1);
		
	}
	public void clickLogin() {
		login.click();
	}
	
	public String errMsgFillFields()
	{
		WebElement activeElement =driver.switchTo().activeElement();
		String message = activeElement.getAttribute("validationMessage");
		return message;
	}
	
	public String invalidMessage() {
		 return invalidmessage.getText();	
		}
	
	public String successMessage() {
		return successmessage.getText();
	}
}








