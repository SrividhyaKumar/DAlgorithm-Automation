package dsalgopages;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgoutilities.PythonExcelReader;

public class StackPages {
	
	
	WebDriver driver;
	PythonExcelReader excel = new PythonExcelReader();
	@FindBy (xpath="//form[@id='answer_form']/div/div/div/textarea") WebElement python_editor;
	@FindBy (xpath="//button[@type='button']") WebElement run;
	@FindBy (xpath="//pre[@id='output']") WebElement output;
	@FindBy (xpath="//a[@href='stack']") WebElement getstarted;
	
	@FindBy (xpath="//a[contains(text(),'Operations in Stack')]") WebElement operations;
	@FindBy (xpath="//a[@class='btn btn-info']") WebElement tryhere;
	@FindBy (xpath="//a[contains(text(),'Implementation')]") WebElement implementation;
	@FindBy (xpath="//a[contains(text(),'Applications')]")WebElement application;
	
	
	public StackPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void getStarted() {
		//driver.findElement(getstarted).click();
		getstarted.click();
	}
	
	public void operationInStack() {
		
		driver.navigate().to("https://dsportalapp.herokuapp.com/stack/");
		//driver.findElement(operations).click();
		(operations).click();
	}

		public void clickTryHere() {
			//driver.findElement(tryhere).click();
			(tryhere).click();
		}
		
		public void clickOnImplementation() {
			driver.navigate().to("https://dsportalapp.herokuapp.com/stack/");
			//driver.findElement(implementation).click();
			(implementation).click();
		}
		
		public void clickOnApplication() {
			driver.navigate().to("https://dsportalapp.herokuapp.com/stack/");
			//driver.findElement(application).click();
			(application).click();
		}
	
		
//		public void pythonEditor() throws IOException {
//				
//				WebElement try_editor_clear=(python_editor);
//				String[] list = excel.fileReader()	;
//				Actions actions= new Actions(driver);
//				actions.click(try_editor_clear).keyDown(Keys.CONTROL).sendKeys("\u0061").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
//			(python_editor).sendKeys(list[0]);
//				(run).click();
//				System.out.println("Output is :"+(output).getText());
//				
//				actions.click(try_editor_clear).keyDown(Keys.CONTROL).sendKeys("\u0061").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
//				(python_editor).sendKeys(list[1]);
//				(run).click();
//				System.out.println("Alert is :"+driver.switchTo().alert().getText() );
//				driver.switchTo().alert().accept();
//					
//					
//				}


}
