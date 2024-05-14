package dsalgodrivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Optional;
import dsalgoutilities.LoggerLoad;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Synchronized;
public class DriverFactory {
		public static ThreadLocal<WebDriver> threadlocaldriver = new ThreadLocal<WebDriver>() ;
		ChromeOptions options=new ChromeOptions();
		EdgeOptions options1=new EdgeOptions();
		FirefoxOptions options2=new FirefoxOptions();
		public WebDriver driver;
		public WebDriver init_driver( @Optional("chrome") String browser) 
		{	
			System.out.println("Browser is : "+ browser);	
			
			if(browser.equalsIgnoreCase("chrome")) {
				options.addArguments("headless");options.addArguments("--headless");
				options.addArguments("excludeSwitches",["ignore-certificate-errors"]);
                                options.addArguments('--disable-gpu');
                                options.addArguments('--headless');
				options.addArguments("--remote-allow-origins=*");
				options.addArguments("--disable-gpu");
				LoggerLoad.info("ChromeBrowser testing");
				WebDriverManager.chromedriver().setup();
				threadlocaldriver.set(new ChromeDriver());
			}
			else if(browser.equalsIgnoreCase("edge")) {
				//options1.addArguments("headless");
				//options1.addArguments("--remote-allow-origins=*");
				LoggerLoad.info("EdgeBrowser testing");
				WebDriverManager.edgedriver().setup();
				threadlocaldriver.set(new EdgeDriver());
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				//options2.addArguments("--remote-allow-origins=*");
				//options2.addArguments("headless");
				options2.addArguments("headless");
				LoggerLoad.info("FirefoxBrowser testing");
				WebDriverManager.firefoxdriver().setup();
				threadlocaldriver.set(new FirefoxDriver());
			}
			else {
				System.out.println("Please enter the correct browser :"+browser);
			}
			getDriver().manage().deleteAllCookies();
			getDriver().manage().window().maximize();
			return getDriver();
		}	
		public static  synchronized WebDriver getDriver() {
			
			return threadlocaldriver.get();
		}

	}


