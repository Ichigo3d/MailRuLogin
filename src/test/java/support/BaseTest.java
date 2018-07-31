package support;


import org.junit.After;
import org.junit.Before;


public class BaseTest {

	@Before
	public void setUpBase() throws Exception {
		 TestContext.initialize();// start to execute TestContext.java
	     TestContext.getDriver().manage().deleteAllCookies(); // Driver delete cache from browser
	     TestContext.getDriver().manage().window().maximize();
	     //TestContext.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     TestContext.getDriver().get("https://mail.ru/");//go to the site through link
	}

	@After
	public void testEnd() {
	        // is scenario is failed, make screenshot
	        //if ( test.isFailed()) {
	            //TakesScreenshot screenshotTaker = (TakesScreenshot) TestContext.getDriver();
	           // byte[] screenshot = screenshotTaker.getScreenshotAs(OutputType.BYTES);//Obtain the screenshot as raw bytes.
	            //test.embed(screenshot, "image/png");//stick it in the report
	       // }
	       TestContext.close();//close TestContext file
	    }

}
