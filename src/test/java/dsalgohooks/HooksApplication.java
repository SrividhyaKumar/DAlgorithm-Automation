package dsalgohooks;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import dsalgodrivers.DriverFactory;
import dsalgoutilities.configreader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
public class HooksApplication 
{	
	private DriverFactory driverFactory ;
	private WebDriver driver;
	private configreader config;
	Properties prop;	
	@Before (order=0)
	public void getProperty() throws IOException {	
		config = new configreader();
		prop = config.init_prop();	
	}
	@Before(order=1)
	public void launchBrowser()
	{
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
	}	
	@After (order=0)
	public void quitBrowser()
	{
		driver.close();
		driver.quit();
	}
	@After (order=1)
	public void tearDown(Scenario sc) 
	{
		if(sc.isFailed())
		{
			String screenshotname = sc.getName().replaceAll(" ","_");
	    	byte[] sourcepath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    	sc.attach(sourcepath,"image/png",screenshotname);  
	}	
}
}



