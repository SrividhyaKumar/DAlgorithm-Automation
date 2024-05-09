package dsalgopages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgoutilities.PythonExcelReader;

public class Graphpage_pf {
 
	WebDriver driver;
	 @FindBy (xpath = "//a[@href='graph']")WebElement getStarted ;
	 @FindBy (xpath = "//a[@href='graph']")WebElement graph ;
	 @FindBy (xpath = "//a[@href='graph-representations']")WebElement graphrep ;
	 @FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea")WebElement python_editor;
	 @FindBy (xpath = "//button[@type='button']")WebElement run;
	 @FindBy (xpath = "//pre[@id='output']")WebElement output;
	 @FindBy (xpath = "//a[@href='/tryEditor']")WebElement tryhere;
	 PythonExcelReader excel = new PythonExcelReader();
	
	public Graphpage_pf(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void clickgetstarted()
	{
		getStarted.click();
	}
	
	public void clickgraph()
	{
		driver.navigate().to("https://dsportalapp.herokuapp.com/graph/");
		graph.click();
	}
	public void clickgraphrepresentation()
	{
		driver.navigate().to("https://dsportalapp.herokuapp.com/graph/");
		graphrep.click();
	}
	
	public void tryHere() {
		tryhere.click();
		
	}
	
	public void pythonEditor() throws IOException {
		
		WebElement try_editor_clear=python_editor;
		String[] list = excel.fileReader();
		Actions actions= new Actions(driver);
		actions.click(try_editor_clear).keyDown(Keys.CONTROL).sendKeys("\u0061").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
		python_editor.sendKeys(list[0]);
		run.click();
		System.out.println("Output is :"+output.getText());
		
		actions.click(try_editor_clear).keyDown(Keys.CONTROL).sendKeys("\u0061").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
		python_editor.sendKeys(list[1]);
		run.click();
		System.out.println("Alert is :"+driver.switchTo().alert().getText() );
		driver.switchTo().alert().accept();		
		}
	
	
}
