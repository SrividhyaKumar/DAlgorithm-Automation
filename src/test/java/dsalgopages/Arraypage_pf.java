package dsalgopages;
import java.io.IOException;
import dsalgoutilities.PythonExcelReader;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Arraypage_pf {
	
	WebDriver driver;
	String url ="https://dsportalapp.herokuapp.com/home";
	  @FindBy(xpath="/html/body")  WebElement Array;
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/a") WebElement Getstarted;
	@FindBy(xpath="/html/body/div[2]/ul[1]/a") WebElement Arraysinpython;
    @FindBy(xpath=" /html/body/div[2]/div/div[2]/a") WebElement Tryhere;
    @FindBy(xpath="//*[@id=\"answer_form\"]/button") WebElement RUN;
    @FindBy(xpath="/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[1]") WebElement Editor;
    @FindBy(xpath="/html/body/div[2]/ul[2]/a ")  WebElement arraylist;
    @FindBy(xpath ="//*[@id=\"content\"]/li[3]/a") WebElement Basicarrylist;
    @FindBy(xpath="/html/body/div[2]/div/div[2]/a")WebElement tryhere;
    @FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre") WebElement area;
    @FindBy(xpath="//*[@id=\"content\"]/li[4]/a") WebElement Applicationarray;
    @FindBy(xpath="//*[@id=\"content\"]/a") WebElement Practice;
    @FindBy (xpath = "//pre[@id='output']")WebElement output;
    @FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre") WebElement python;
    @FindBy(xpath="//*[@id=\"answer_form\"]/input[2]") WebElement  submit;
    PythonExcelReader excel = new PythonExcelReader();

	public Arraypage_pf(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
	public  void open() {
        driver.get(url);
        System.out.println("open the url");
        Array.click();
         Getstarted.click();
         System.out.println("click on GetStarted");
         System.out.println("open the array page");
         
       }
	public void array() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,1000)");
    	Arraysinpython.click();
    	System.out.println("open the arraysinpage");
    }
    public void  Tryhere() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
     	js.executeScript("window.scrollBy(0,1000)");
     	(Tryhere).click();
     	System.out.println("click on Tryhere");
        System.out.println("opens python editor");
    }
    
    public void pythonEditor() throws IOException {
    	
    	WebElement try_editor_clear=python;
    	String[] list = excel.fileReader();
    	python.sendKeys(list[0]);
    	RUN.click();
    	System.out.println("Output is :"+output.getText());
    	Actions actions = new Actions(driver);
    	actions.click(try_editor_clear).keyDown(Keys.CONTROL).sendKeys("\u0061").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
    	python.sendKeys(list[1]);
    	RUN.click();
    	System.out.println("Alert is :"+driver.switchTo().alert().getText() );
    	System.out.println("No error msg is diaplayed");
    	driver.switchTo().alert().accept();		
    	}
   
}