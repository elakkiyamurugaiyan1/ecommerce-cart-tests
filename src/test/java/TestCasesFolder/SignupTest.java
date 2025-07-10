package TestCasesFolder;

import java.io.IOException;


import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseTest;
import PageModel1.SignupPage;

public class SignupTest extends BaseTest {
	
	SignupPage signuppage;
	
	@Test
		public void Registration()throws IOException
		{
		signuppage =new SignupPage(driver);
		signuppage.signup("Nila", "nilamaran1234567890123456789012@gmail.com");
		signuppage.accountInformation("hello@123", "17", "March", "2019");
	
		signuppage.addressInformation("Yazh", "Nila", "Google", "Avenue 1", "West", " Tamilnadu", "Trichy", "1212", "214124214");
		try {
			Assert.assertEquals(driver.getTitle(), "Automation Exercise", "page title does not matched");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		}
}
