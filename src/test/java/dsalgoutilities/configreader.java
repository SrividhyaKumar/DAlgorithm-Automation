package dsalgoutilities;	
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	public class configreader {
		private static String browserType = null;
		private Properties prop;	
		public Properties init_prop()
		{
			prop=new Properties();
			try
			{
				FileInputStream ip=new FileInputStream("./src/test/resources/dsalgoconfiguration/configuration.properties");
				prop.load(ip);
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
	        }
			catch (IOException e)
			{
				e.printStackTrace();
			}
			return prop;
		}
		public static void setBrowserType(String browser)
		{
			browserType = browser;
		}
		public static String getBrowserType() throws Throwable
		{
			if (browserType != null)
				return browserType;
			else
				throw new RuntimeException("browser not specified in the testng.xml");
		}
}

