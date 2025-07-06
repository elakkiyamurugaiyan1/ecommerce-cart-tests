package PageModel1;

import org.openqa.selenium.By;

import DriverManager.DriverManager;

public class CheckoutOrderPage {

	public void proceedToCheckout()
	{
		DriverManager.driver.findElement(By.xpath("//a[text()='Proceed To Checkout']")).click();
		
	}
	public void placeorder()
	{
		DriverManager.driver.findElement(By.xpath("//a[@href='/payment']")).click();
		
	}
	public void PaymentDetails(String cardname, String cardnumber, String CVCNum, String expiryMonth, String expiryyear)
	{
		DriverManager.driver.findElement(By.name("name_on_card")).sendKeys(cardname);
		DriverManager.driver.findElement(By.name("card_number")).sendKeys(cardnumber);
		DriverManager.driver.findElement(By.name("cvc")).sendKeys(CVCNum);
		DriverManager.driver.findElement(By.name("expiry_month")).sendKeys(expiryMonth);
		DriverManager.driver.findElement(By.name("expiry_year")).sendKeys(expiryyear);
		DriverManager.driver.findElement(By.xpath("//*[text()='Pay and Confirm Order']")).click();		
	}
}
