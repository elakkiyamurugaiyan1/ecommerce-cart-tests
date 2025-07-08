package TestCasesFolder;

import java.io.IOException;


import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DriverManager.DriverManager;
import PageModel1.SignupPage;

public class SignupTest {
	SignupPage signuppage;
	@BeforeMethod
	public void StartTest()
	{
		//Launch browser & URL
		DriverManager.setup();
		DriverManager.driver.get("https://automationexercise.com/login");
		// Initialize Page objects
		 signuppage=new SignupPage();
			
	}
	
	@Test
		public void Registration()throws IOException
		{
		signuppage.signup("Nila", "nilamaran12345678901234567890@gmail.com");
		signuppage.accountInformation("hello@123", "17", "March", "2019");
	
		signuppage.addressInformation("Yazh", "Nila", "Google", "Avenue 1", "West", " Tamilnadu", "Trichy", "1212", "214124214");
		Assert.assertEquals(DriverManager.driver.getTitle(), "Automation Exercise", "page title does not matched");
	
		}
}
