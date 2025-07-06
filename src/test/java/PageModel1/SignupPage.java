package PageModel1;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.Select;


import DriverManager.DriverManager;

public class SignupPage {

	public void signup(String name, String mailId)
	{
		DriverManager.driver.findElement(By.name("name")).sendKeys(name);
		DriverManager.driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(mailId);
		DriverManager.driver.findElement(By.xpath("//button[text()='Signup']")).click();
	}
	
	public void accountInformation(String password, String day, String month, String year)
	{
		DriverManager.driver.findElement(By.id("id_gender2")).click();
		DriverManager.driver.findElement(By.id("password")).sendKeys(password);
		new Select(DriverManager.driver.findElement(By.id("days"))).selectByVisibleText(day);
	   new Select(DriverManager.driver.findElement(By.id("months"))).selectByVisibleText(month);
	   new Select(DriverManager.driver.findElement(By.id("years"))).selectByVisibleText(year);
	}
	
	public void addressInformation(String firstname, String lastname,
			String address1,String address2, String country, String state, String city, 
			String zipcode, String mobileNumber)
	{
		DriverManager.driver.findElement(By.id("first_name")).sendKeys(firstname);
		DriverManager.driver.findElement(By.id("last_name")).sendKeys(lastname);
		DriverManager.driver.findElement(By.id("address1")).sendKeys(address1);
		DriverManager.driver.findElement(By.id("address2")).sendKeys(address2);
		//new Select(DriverManager.driver.findElement(By.id("country"))).selectByVisibleText(country);;
		DriverManager.driver.findElement(By.id("state")).sendKeys(state);
		DriverManager.driver.findElement(By.id("city")).sendKeys(city);
		DriverManager.driver.findElement(By.id("zipcode")).sendKeys(zipcode);
		DriverManager.driver.findElement(By.id("mobile_number")).sendKeys(mobileNumber);
		DriverManager.driver.findElement(By.xpath("//*[text()='Create Account']")).click();
		DriverManager.driver.findElement(By.xpath("//*[text()='Continue']")).click();
	
	}
}
