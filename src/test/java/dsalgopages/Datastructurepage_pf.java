package dsalgopages;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgoutilities.PythonExcelReader;

public class Datastructurepage_pf {
   WebDriver driver;
   
   @FindBy (linkText = "Sign in") WebElement signin;
   @FindBy (xpath = "//input[@name='username']") WebElement username;
   @FindBy (xpath = "//input[@name='password']") WebElement password;
   @FindBy (xpath = "//input[@value='Login']") WebElement login;
   @FindBy (xpath = "//div[@role='alert']")WebElement message;
   @FindBy (xpath = "//a[@href='data-structures-introduction']")WebElement getStarted  ;
   @FindBy (xpath = "//a[@href='time-complexity']")WebElement timecomplexity;
   @FindBy (xpath = "//a[@href='/tryEditor']")WebElement tryhere;
   @FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea")WebElement python_editor;
   @FindBy (xpath = "//button[@type='button']")WebElement run;
   @FindBy (xpath = "//pre[@id='output']")WebElement output;
	PythonExcelReader excel = new PythonExcelReader();
   
public Datastructurepage_pf(WebDriver driver)
{ 
	PageFactory.initElements(driver, this);
	this.driver = driver; 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

public void Homepage() { driver.get("https://dsportalapp.herokuapp.com/home"); }

public void signin() { signin.click(); }

public void enterusernameandpassword(String username1,String password1)
{
	username.sendKeys(username1);
	password.sendKeys(password1);
	login.click();
}

public String getmessage()
{
	String value=message.getText();
	return value;
}

public void clickgetstarted() { getStarted.click(); }

public void clickOnTimeComplexity() throws InterruptedException {
	driver.navigate().to("https://dsportalapp.herokuapp.com/data-structures-introduction/");	
	timecomplexity.click();
}

public void clicktryhere() { tryhere.click();  }

public void pythonEditor() throws IOException {
	
	WebElement try_editor_clear=python_editor;
	String[] list = excel.fileReader();
	python_editor.sendKeys(list[0]);
	run.click();
	System.out.println("Output is :"+output.getText());
	Actions actions = new Actions(driver);
	actions.click(try_editor_clear).keyDown(Keys.CONTROL).sendKeys("\u0061").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
	python_editor.sendKeys(list[1]);
	run.click();
	System.out.println("Alert is :"+driver.switchTo().alert().getText() );
	driver.switchTo().alert().accept();		
	}
}