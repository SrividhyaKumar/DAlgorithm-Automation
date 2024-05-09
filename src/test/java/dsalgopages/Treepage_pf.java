package dsalgopages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgoutilities.PythonExcelReader;

public class Treepage_pf {
//  
//	   @FindBy (linkText = "Sign in") WebElement signin;
//	   @FindBy (xpath = "//input[@name='username']") WebElement username;
//	  @FindBy (xpath = "//input[@name='password']") WebElement password;
//	   @FindBy (xpath = "//input[@value='Login']") WebElement login;
	 @FindBy (xpath = "//div[@role='alert']")WebElement message;
	   @FindBy (xpath = "//a[@href='tree']")WebElement getStarted ;
	   @FindBy (xpath = "//a[@href='overview-of-trees']")WebElement overview ;
	   @FindBy (xpath = "//a[@href='terminologies']")WebElement terminologies ;
	   @FindBy (xpath = "//a[@href='types-of-trees']")WebElement typesoftree ;
	   @FindBy (xpath = "//a[@href='tree-traversals']")WebElement traversals ;
	   @FindBy (xpath = "//a[@href='traversals-illustration']")WebElement illustration ;
	   @FindBy (xpath = "//a[@href='binary-trees']")WebElement binarytree ;
	   @FindBy (xpath = "//a[@href='types-of-binary-trees']")WebElement typebinary ;
	   @FindBy (xpath = "//a[@href='implementation-in-python']")WebElement implementationpython ;
	   @FindBy (xpath = "//a[@href='binary-tree-traversals']")WebElement btreetraversal ;
	   @FindBy (xpath = "//a[@href='implementation-of-binary-trees']")WebElement impbtree ;
	   @FindBy (xpath = "//a[@href='applications-of-binary-trees']")WebElement appbtree ;
	   @FindBy (xpath = "//a[@href='binary-search-trees']")WebElement bsearch ;
	   @FindBy (xpath = "//a[@href='implementation-of-bst']")WebElement impofbst ;
	   @FindBy (xpath = "//a[@href='/tryEditor']")WebElement tryhere;
	   @FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea")WebElement python_editor;
	   @FindBy (xpath = "//button[@type='button']")WebElement run;
	   @FindBy (xpath = "//pre[@id='output']")WebElement output;
	   PythonExcelReader excel = new PythonExcelReader();
	   Actions action;			
	 WebDriver driver;
	 
	public Treepage_pf(WebDriver driver)
	{ 
		PageFactory.initElements(driver, this);
		this.driver = driver; 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}


	public void clickgetstarted() { getStarted.click(); }
	
	public void clickOnOverview() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
		overview.click();
		
	}
	
	public void tryHere() {
		tryhere.click();
//		WebElement ele = driver.findElement((By) tryhere);
//		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
//		executor1.executeScript("arguments[0].click();",ele );
		
	}
	
	public void clickTerminologies() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
		terminologies.click();
		
			
		}		
		
		public void typesOfTrees() {
			
			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
			typesoftree.click();
			
			
		}
		
//		public void traversalIllustration() {
//			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
//			traversals.click();
//			
//		}
//		
		public void binaryTrees() {
			
			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
			binarytree.click();
			
		}
		
		public void typesOfBinaryTrees() {
			
			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
			typebinary.click();
			
		}
		
		public void implementationInPython() {
			
			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
			implementationpython.click();
			
		}
		
		public void binaryTreeTraversal() {
			
			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
			btreetraversal.click();
			
		}
		
		public void implementationOfBinaryTrees() {
			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
		impbtree.click();
			
		}
		
		public void applicationOfBinaryTrees() {
			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
			appbtree.click();
			
		}
		
		
		public void binarySearchTree() {
			
			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
			bsearch.click();
			
		}
		
		public void implementationOfBST() {
			
			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
			impofbst.click();
			
			
		}
		
		public void treeTraversal() {
			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
			traversals.click();
			
			
			
		}
		
		public void pythonEditor() throws IOException {
			
			WebElement try_editor_clear=python_editor;
			String[] list = excel.fileReader();
			Actions actions= new Actions(driver);
			actions.click(try_editor_clear).keyDown(Keys.CONTROL).sendKeys("\u0061").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
			python_editor.sendKeys(list[0]);
		    run.click();;
			System.out.println("Output is :"+output.getText());
			
			actions.click(try_editor_clear).keyDown(Keys.CONTROL).sendKeys("\u0061").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
			python_editor.sendKeys(list[1]);
			run.click();
			System.out.println("Alert is :"+driver.switchTo().alert().getText() );
			driver.switchTo().alert().accept();		
			}
		
		
	
}
