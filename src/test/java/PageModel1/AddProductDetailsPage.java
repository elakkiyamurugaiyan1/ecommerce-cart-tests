package PageModel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProductDetailsPage {
WebDriver driver;
public AddProductDetailsPage(WebDriver driver)
{
	this.driver=driver;
}
	public void ClickProduct()
	{
		driver.findElement(By.xpath("//a[@href='/products']")).click();
	}
	
	public void selectCategory()
	{
		driver.findElement(By.xpath("//a[@href='#Women']")).click();
	driver.findElement(By.xpath("//a[@href='/category_products/2']")).click();
		
	
	
	}
	public void selectProductToCart()
	{
		driver.findElement(By.xpath("//img[@src='/get_product_picture/1']")).click();
		driver.findElement(By.xpath("//*[text()='Blue Top' ]//ancestor::div[contains(@class,'productinfo text-center')]//following-sibling::a[text()='Add to cart'][1]")).click();
		driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();
		
	}
	public void ViewCart()
	{
	driver.findElement(By.xpath("//a[@href='/view_cart']")).click();
			
	}

	
}
