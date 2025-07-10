package PageModel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Base.BaseTest;

public class SignupPage {
	WebDriver driver;
	public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

	public void signup(String name, String mailId)
	{
		driver.findElement(By.name("name")).sendKeys(name);
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(mailId);
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
	}
	
	public void accountInformation(String password, String day, String month, String year)
	{
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("password")).sendKeys(password);
		new Select(driver.findElement(By.id("days"))).selectByVisibleText(day);
	   new Select(driver.findElement(By.id("months"))).selectByVisibleText(month);
	   new Select(driver.findElement(By.id("years"))).selectByVisibleText(year);
	}
	
	public void addressInformation(String firstname, String lastname,
			String address1,String address2, String country, String state, String city, 
			String zipcode, String mobileNumber)
	{
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("last_name")).sendKeys(lastname);
		driver.findElement(By.id("address1")).sendKeys(address1);
		driver.findElement(By.id("address2")).sendKeys(address2);
		//new Select(DriverManager.driver.findElement(By.id("country"))).selectByVisibleText(country);;
		driver.findElement(By.id("state")).sendKeys(state);
		driver.findElement(By.id("city")).sendKeys(city);
		driver.findElement(By.id("zipcode")).sendKeys(zipcode);
		driver.findElement(By.id("mobile_number")).sendKeys(mobileNumber);
		driver.findElement(By.xpath("//*[text()='Create Account']")).click();
		driver.findElement(By.xpath("//*[text()='Continue']")).click();
	
	}
}
