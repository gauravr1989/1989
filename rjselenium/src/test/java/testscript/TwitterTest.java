package testscript;

	import org.testng.Assert;
	import org.testng.AssertJUnit;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

	import library.BaseTest;

	import pom.GooglePagePO;
	import pom.TwitterGoogleResultPO;

	public class TwitterTest extends BaseTest {
		@Test
		public void SearchTwt() {
			try {
				GooglePagePO homePO=new GooglePagePO(driver);
				homePO.googleSrch("Twitter");
				TwitterGoogleResultPO Tw=new TwitterGoogleResultPO(driver);
				Reporter.log("total no of links=" +Tw.allLinksSize());
				String eTitle="Twitter - Google Search";
				Tw.checkTitle(eTitle);

				String aTitle=driver.getTitle();
				System.out.println("Title is"+aTitle);
				AssertJUnit.assertEquals(aTitle, eTitle);
				
			}
			catch (Exception e) {
		e.printStackTrace();
		Reporter.log("total no of links=",true);
		//AssertJUnit.fail();
		Assert.fail();
			}
		}
}
