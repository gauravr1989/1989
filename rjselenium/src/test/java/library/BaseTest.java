package library;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.firefox.FirefoxDriver;
    import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;





	public class BaseTest implements Constants {
		public WebDriver driver;
		
		@BeforeMethod(alwaysRun=true)
		public void launchBrowser() {
		    System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
			//System.setProperty(GECKO_KEY, GECKO_PATH);
			//driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(TEST_URL);
			
		}
		@AfterMethod(alwaysRun=true) 
		public void closeBrowser() {
			driver.quit();
		}
			
}
