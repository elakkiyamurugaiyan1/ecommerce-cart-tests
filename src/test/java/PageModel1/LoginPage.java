package PageModel1;

import org.openqa.selenium.By;

import DriverManager.DriverManager;

public class LoginPage {

	public void loginWithCorrectCredential(String loginemail, String password)
		{
		
		DriverManager.driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys(loginemail);
		DriverManager.driver.findElement(By.name("password")).sendKeys(password);
		DriverManager.driver.findElement(By.xpath("//button[text()='Login']")).click();
		}
	public void Logout()
	{
	DriverManager.driver.findElement(By.xpath("//a[text()=' Logout']")).click();
	
	}
	
	public void loginWithInorrectCredential(String loginemail, String password)
	{
	
	DriverManager.driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys(loginemail);
	DriverManager.driver.findElement(By.name("password")).sendKeys(password);
	DriverManager.driver.findElement(By.xpath("//*[text()='Login']")).click();

}
}
