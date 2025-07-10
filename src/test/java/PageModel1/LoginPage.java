package PageModel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BaseTest;

public class LoginPage {
WebDriver driver;
	public  LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void loginWithCorrectCredential(String loginemail, String password)
		{
		
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys(loginemail);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		}
	public void Logout()
	{
	driver.findElement(By.xpath("//a[text()=' Logout']")).click();
	
	}
	
	public void loginWithInorrectCredential(String loginemail, String password)
	{
	
	driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys(loginemail);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.xpath("//*[text()='Login']")).click();

}
}
