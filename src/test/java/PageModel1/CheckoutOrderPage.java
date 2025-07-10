package PageModel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BaseTest;

public class CheckoutOrderPage {
WebDriver driver;

public CheckoutOrderPage(WebDriver driver)
{
	this.driver=driver;
}
	public void proceedToCheckout()
	{
	driver.findElement(By.xpath("//a[text()='Proceed To Checkout']")).click();
		
	}
	public void placeorder()
	{
		driver.findElement(By.xpath("//a[@href='/payment']")).click();
		
	}
	public void PaymentDetails(String cardname, String cardnumber, String CVCNum, String expiryMonth, String expiryyear)
	{
		driver.findElement(By.name("name_on_card")).sendKeys(cardname);
		driver.findElement(By.name("card_number")).sendKeys(cardnumber);
		driver.findElement(By.name("cvc")).sendKeys(CVCNum);
		driver.findElement(By.name("expiry_month")).sendKeys(expiryMonth);
		driver.findElement(By.name("expiry_year")).sendKeys(expiryyear);
		driver.findElement(By.xpath("//*[text()='Pay and Confirm Order']")).click();		
	}
}
