package pom;


	import java.util.List;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	import library.BasePage;

	public class FacebookGoogleResultPO extends BasePage {
		public FacebookGoogleResultPO(WebDriver driver) {
			super (driver);
		}
		@FindBy(xpath="//a")
		private List<WebElement> allLinks;
		public int allLinksSize() {
			return allLinks.size();
			
		}

}
