package dsalgopages;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import dsalgoutilities.PythonExcelReader;

public class Queuepage_pf {
	WebDriver driver;
	String url ="https://dsportalapp.herokuapp.com/queue/";
    @FindBy (xpath="/html/body/div[2]/ul[1]/a") WebElement   queueinpyhton;
    @FindBy(xpath="/html/body/div[2]/div/div[2]/a") WebElement tryhere;
    @FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[6]") WebElement editor; 
    @FindBy(xpath="//*[@id=\"answer_form\"]/button") WebElement RUN;
    @FindBy(xpath="//*[@id=\"output\"]") WebElement output;
    @FindBy(xpath="//*[@id=\"content\"]/li[3]/a") WebElement usingarray;
    PythonExcelReader excel = new PythonExcelReader();
	public Queuepage_pf(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	public void home() {
		driver.get(url);
		System.out.println("open the queue page");
		 queueinpyhton.click();
		 System.out.println("click the queueinpython");
		 System.out.println("user redirect the queueinpython");
	}
	public void tryhere() {
		 tryhere.click();
		 System.out.println("click on tryhere");
		 System.out.println("open the browser with run button page");
	 }
	 public void pythonEditor() throws IOException {
	    	
	    	WebElement try_editor_clear=editor;
	    	String[] list = excel.fileReader();
	    	editor.sendKeys(list[0]);
	    	RUN.click();
	    	System.out.println("Output is :"+output.getText());
	    	Actions actions = new Actions(driver);
	    	actions.click(try_editor_clear).keyDown(Keys.CONTROL).sendKeys("\u0061").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
	    	editor.sendKeys(list[1]);
	    	RUN.click();
	    	System.out.println("Alert is :"+driver.switchTo().alert().getText() );
	    	System.out.println("No error msg is diaplayed");
	    	driver.switchTo().alert().accept();		
	    	}

	private void Hello(String string) {
		// TODO Auto-generated method stub
		
	}
	public void invalidcode() {
		 System.out.println("enter the code");
		editor.sendKeys("123");
		RUN.click();
		System.out.println("click on run button");
		output.getText();
		System.out.println("error  message");
	}
	public void page() {
		driver.navigate().back();
		usingarray.click();
		 System.out.println("open the browser Implementation using Collections.deque");
	}
	}



