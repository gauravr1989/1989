package testscript;

	import org.testng.Assert;
	import org.testng.AssertJUnit;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

	import library.BaseTest;
	import pom.GooglePagePO;
	import pom.InstagramGoogleResultPO;

	public class InstagramTest extends BaseTest {
		@Test
		public void SearchInsta() {
			try {
				GooglePagePO homePO=new GooglePagePO(driver);
				homePO.googleSrch("Instagram");
				InstagramGoogleResultPO Ins=new InstagramGoogleResultPO(driver);
				Reporter.log("total no of links=" +Ins.allLinksSize());
				String eTitle="Instagram - Google Search";
				Ins.checkTitle(eTitle);

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
