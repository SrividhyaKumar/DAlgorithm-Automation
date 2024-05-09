package dsalgopages;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 public class Homepage_pf 
 {
	 private WebDriver driver;
	 
	    @FindBy (xpath = "//p[contains(text(),'You are at the right place')]") WebElement message;
	    @FindBy (xpath = "//button[@class='btn']") WebElement getBtn;
	    @FindBy (linkText = "Sign in") WebElement signin;
	    @FindBy (xpath = "//a[@class='nav-link dropdown-toggle']") WebElement dropdown;
	    @FindBy (xpath = "//div[@class='dropdown-menu show']/a") List<WebElement>  dropdownsize;
	   // By dropdownsize = By.xpath("//div[@class='dropdown-menu show']/a");
	    @FindBy (xpath = "//a[contains(text(),'Linked List')]") WebElement linkedlist;
	    @FindBy (xpath = "//div[@role='alert']") WebElement alert;
	    @FindBy (xpath = "//a[@href='data-structures-introduction']") WebElement getStarted;
	    @FindBy (linkText = "Register") WebElement register;
	    @FindBy (linkText = "Login") WebElement login;
	public Homepage_pf(WebDriver driver)
	
	{ 
		PageFactory.initElements(driver,this);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
    public void getUrl()
    {
		driver.get("https://dsportalapp.herokuapp.com/");
	}
	public String message()
	{
		
		return message.getText();
		
	}
	public void clickGetStarted() 
	{
		
		getBtn.click();
	}
	public String registerLink()
	{
		return register.getText();
	}
	public String signinLink() 
	{
	
		return signin.getText();
	}
	public void dropDown() 
	{
		
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");	
		dropdown.click();
	}
	public int dropDownMenuSize() 
	{
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");
		dropdown.click();
		return dropdownsize.size();
	}
	public List<String> dropDownList() 
	{

		List<String> dropdownlist = new ArrayList<String>();		
			for (WebElement e : dropdownsize) {	
			String text = e.getText();		
			System.out.println(text);		
			 dropdownlist.add(text);
	}
		return dropdownlist;
    }
	public void clickDropdown()
	{
		dropdown.click();
		linkedlist.click();			
	}
		public String errorMSg() 
	{
		
		String alertmsg = alert.getText();
		return alertmsg;
	}
public void clickDataStructures() 
    {
		
		getStarted.click();
		
	}
		public String errorMsg1() 
	{
		 String alertmsg1 =alert.getText();
				return alertmsg1;
	}	public void getRegisterPage() 
	{
		driver.get("https://dsportalapp.herokuapp.com/register");
	}
	public String gettextLogin() 
	{
		
	return login.getText();
	}	
}
