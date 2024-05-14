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

public class LinkedListPages {
	
	WebDriver driver;
//	PythonExcelReader excel = new PythonExcelReader();
//	@FindBy (xpath="//form[@id='answer_form']/div/div/div/textarea") WebElement python_editor;
	//@FindBy (xpath = "//input[@name='username']")WebElement username;
	@FindBy (xpath="//button[@type='button']") WebElement button;
	@FindBy (xpath="//pre[@id='output']") WebElement output;
	@FindBy (xpath="//a[@href='linked-list']") WebElement getstarted;
	@FindBy (xpath="(//a[normalize-space()='Introduction'])[1]")WebElement introduction;
	@FindBy (xpath="//p[normalize-space()='Introduction']")WebElement introductiontext;
	@FindBy (xpath="//a[@class='btn btn-info']") WebElement tryhere;
	@FindBy (xpath="//a[@href='creating-linked-list']") WebElement creatinglikedlist;
	@FindBy (xpath="//a[@href='types-of-linked-list']") WebElement typesoflinkedlist;
	@FindBy (xpath="//a[@href='implement-linked-list-in-python']") WebElement implementlinkedlist;
	@FindBy (xpath="//a[@href='traversal']") WebElement traversal;
	@FindBy (xpath="//a[@href='insertion-in-linked-list']") WebElement insertion;
	@FindBy (xpath="//a[@href='deletion-in-linked-list']") WebElement deletion;
	//@FindBy (xpath="//a[@href='/linked-list/practice']") WebElement PracticeQ;
	//@FindBy (xpath="//a[normalize-space()='Practice Questions']")WebElement PracticeQ;
	//@FindBy(linkText="Practice Questions")WebElement PracticeQ;
	
	public LinkedListPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void getStarted() {
		(getstarted).click();
	}
	
	public void clickOnIntroduction() {
		//driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/");
		(introduction).click();
	}
	
	public String introductiontext() {
		return (introductiontext).getText();
	}
	
	public void clickOnTryHere() {
		(tryhere).click();
	}
	


	public void creatingLinkedList() {
		
		//driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/");
		(creatinglikedlist).click();
	}
	
	public void typesOfLinkedList() {
		
		//driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/");
		(typesoflinkedlist).click();
	}
	
	public void implementLinkedList() {
		//driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/");
		(implementlinkedlist).click();
	}
	
	public void traversal() {
		//driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/");
		(traversal).click();
	}
	public void insertion() {
		//driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/");
		(insertion).click();
	}
	
//public void pythonEditor() throws IOException {
//		
//		WebElement try_editor_clear=driver.findElement(python_editor);
//		String[] list = excel.fileReader()	;
//		Actions actions= new Actions(driver);
//		actions.click(try_editor_clear).keyDown(Keys.CONTROL).sendKeys("\u0061").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
//		driver.findElement(python_editor).sendKeys(list[0]);
//		driver.findElement(run).click();
//		System.out.println("Output is :"+driver.findElement(output).getText());
//		
//		actions.click(try_editor_clear).keyDown(Keys.CONTROL).sendKeys("\u0061").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
//		(python_editor).sendKeys(list[1]);
//		driver.findElement(run).click();
//		System.out.println("Alert is :"+driver.switchTo().alert().getText() );
//		driver.switchTo().alert().accept();
//			
//			
//		}
	
	public void  deletion() {
		//driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/");
		(deletion).click();
	}
	
//	public void PracticeQ() {
//		(PracticeQ).click();
//	}

}
