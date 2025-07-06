package TestCasesFolder;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DriverManager.DriverManager;
import PageModel1.LoginPage;

public class LoginTest {
LoginPage loginpage;
	@BeforeMethod
	public void StartTest()
	{
		DriverManager.setup();
		DriverManager.driver.get("https://automationexercise.com/login");
		loginpage=new LoginPage();
	}
	
	@Test
	public void loginwith_correct_credentials_withoutLogout()throws IOException
	{
		loginpage.loginWithCorrectCredential("nilamaran12@gmail.com", "hello@123");
		Assert.assertEquals(DriverManager.driver.getTitle(), "Automation Exercise", "Login is not successful" );
 
	}
	@Test
	public void loginwith_Incorrect_credentials()throws IOException
	{
		
		loginpage.loginWithInorrectCredential("nilamaran12@gmail.com", "hell@123");
		boolean errorDisplayed= DriverManager.driver.findElement(By.xpath("//*[text()='Your email or password is incorrect!']")).isDisplayed();
				
		Assert.assertTrue(errorDisplayed, "Error message not displayed for wrong credentials" );

	}
	
	@AfterMethod
	public void close()
	{
		DriverManager.driver.close();
	}
	

}
