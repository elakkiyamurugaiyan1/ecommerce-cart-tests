package TestCasesFolder;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DriverManager.DriverManager;
import PageModel1.AddProductDetailsPage;
import PageModel1.LoginPage;

public class AddProductToCartTest  {
	
	AddProductDetailsPage addProductToCart;
	LoginPage loginpage;
	
	@BeforeMethod
	public void startTest()
	{	
		DriverManager.setup();
		DriverManager.driver.get("https://automationexercise.com/login");
		addProductToCart=new AddProductDetailsPage();
		loginpage=new LoginPage();
		
	}
	
	@Test
	
	public void addProduct() throws IOException
	{ 
		loginpage.loginWithCorrectCredential("nilamaran123456@gmail.com", "hello@123");
		addProductToCart.ClickProduct();
		addProductToCart.selectCategory();
		addProductToCart.selectProductToCart();
		addProductToCart.ViewCart();
		Boolean CartProduct=DriverManager.driver.findElement(By.xpath("//a[@href='/product_details/1']")).isDisplayed();
		Assert.assertTrue(CartProduct, "Blue top is not found in the Cart");
	}

}
