package dsalgopages;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import dsalgoutilities.PythonExcelReader;
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
    @FindBy(xpath="/html/body/div[3]/a") WebElement max;
    @FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre") WebElement python;
    @FindBy(xpath="//*[@id=\"answer_form\"]/input[2]") WebElement  submit;
    @FindBy(xpath="/html/body/div[4]/a") WebElement Even;
    @FindBy(xpath="/html/body/div[5]/a") WebElement squares;
	

	public Arraypage_pf(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
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
    public void  RunButton() {
    	RUN.click();
    	 System.out.println("No error msg is diaplayed");
    }
}