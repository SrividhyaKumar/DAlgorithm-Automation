package dsalgopages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Loginpages_sd 
{
	WebDriver driver;
	
	@FindBy (xpath = "//input[@name='username']")WebElement username;
	@FindBy (xpath = "//input[@name='password']")WebElement password;
	@FindBy (xpath = "//input[@type='submit']")WebElement login;
	@FindBy (xpath = "//div[@role='alert']")WebElement invalidmessage;
	@FindBy (xpath = "(//div[@role='alert'])[1]")WebElement successmessage;
//	By username =By.xpath("//input[@name='username']");
//	By password = By.xpath("//input[@name='password']");
//	By login = By.xpath("//input[@type='submit']");
//	By invalidmessage = By.xpath("//div[@role='alert']");
//	By successmessage = By.xpath("//div[@role='alert']");
	
	public Loginpages_sd(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void enterUsernamePassword(String username1, String password1) {
		
		username.sendKeys(username1);
		password.sendKeys(password1);

		
	}
	public void clickLogin() {
		//driver.findElement(login).click();
	login.click();
	}
	
	public String errMsgFillFields()
	{
		WebElement activeElement =driver.switchTo().activeElement();
		String message = activeElement.getAttribute("validationMessage");
		return message;
	}
	
	public String invalidMessage() {
		// return driver.findElement(invalidmessage).getText();	
		return invalidmessage.getText();
		}
	
	public String successMessage() {
		//return driver.findElement(successmessage).getText();
		return successmessage.getText();
	}
}








