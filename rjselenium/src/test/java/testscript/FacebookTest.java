package testscript;

	import org.testng.Assert;
	import org.testng.AssertJUnit;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

	import library.BaseTest;
	import pom.FacebookGoogleResultPO;
	import pom.GooglePagePO;

	public class FacebookTest extends BaseTest {
		@Test
		public void SearchFb() {
			try {
				GooglePagePO homePO=new GooglePagePO(driver);
				homePO.googleSrch("facebook");
				FacebookGoogleResultPO fb=new FacebookGoogleResultPO(driver);
				Reporter.log("total no of links=" +fb.allLinksSize());
				String eTitle="facebook - Google Search";
				fb.checkTitle(eTitle);

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
