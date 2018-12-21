package testscript;

	import org.testng.Assert;
	import org.testng.AssertJUnit;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

	import library.BaseTest;
	import pom.GooglePagePO;
	import pom.LinkedInGoogleResultPO;

	public class LinkedInTest extends BaseTest {
		@Test
		public void SearchLinked() {
			try {
				GooglePagePO homePO=new GooglePagePO(driver);
				homePO.googleSrch("Linkedn");
				LinkedInGoogleResultPO Ld=new LinkedInGoogleResultPO(driver);
				Reporter.log("total no of links=" +Ld.allLinksSize());
				String eTitle="Linkedn - Google Search";
				Ld.checkTitle(eTitle);

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
