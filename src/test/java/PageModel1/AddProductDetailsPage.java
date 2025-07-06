package PageModel1;

import org.openqa.selenium.By;

import DriverManager.DriverManager;

public class AddProductDetailsPage {

	public void ClickProduct()
	{
		DriverManager.driver.findElement(By.xpath("//a[@href='/products']")).click();
	}
	
	public void selectCategory()
	{
		DriverManager.driver.findElement(By.xpath("//a[@href='#Women']")).click();
		DriverManager.driver.findElement(By.xpath("//a[@href='/category_products/2']")).click();
		
	
	
	}
	public void selectProductToCart()
	{
		DriverManager.driver.findElement(By.xpath("//img[@src='/get_product_picture/1']")).click();
		DriverManager.driver.findElement(By.xpath("//*[text()='Blue Top' ]//ancestor::div[contains(@class,'productinfo text-center')]//following-sibling::a[text()='Add to cart'][1]")).click();
		DriverManager.driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();
		
	}
	public void ViewCart()
	{
		DriverManager.driver.findElement(By.xpath("//a[@href='/view_cart']")).click();
				
	}

	
}
