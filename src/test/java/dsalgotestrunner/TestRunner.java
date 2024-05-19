package dsalgotestrunner;
import org.junit.runner.RunWith;
import org.testng.annotations.*;
//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import dsalgoutilities.configreader;
//@RunWith(Cucumber.class)
@CucumberOptions(
      features = {".\\src\\test\\resources\\dsalgofeatures"},
      glue= {"dsalgostepdefinitions","dsalgohooks"},
     // tags= "@Datastructurepage" ,
      plugin={"pretty",
    		  "html:target/report.html",
   		  "json:target/report.json",
   		  "junit:target/report.xml",
   		  "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
    		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
    		  "timeline:test-output-thread/"
    		 }
)
public class TestRunner extends AbstractTestNGCucumberTests
{
  @BeforeTest
  @Parameters({"browser"})
	public void defineBrowser(@Optional("chrome")String browser) throws Throwable
  {
	  configreader.setBrowserType(browser);
  }
  @Override	 
  @DataProvider(parallel = true)
  public Object[][] scenarios()
  {
	 return super.scenarios();
  }
}
 

