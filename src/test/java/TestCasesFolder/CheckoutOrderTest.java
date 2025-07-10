package TestCasesFolder;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseTest;
import PageModel1.AddProductDetailsPage;
import PageModel1.CheckoutOrderPage;
import PageModel1.LoginPage;

public class CheckoutOrderTest extends BaseTest {
AddProductDetailsPage addProductToCart;
CheckoutOrderPage checkOutOrder;
LoginPage loginpage;

@BeforeMethod
public void startTest()
{	
	loginpage=new LoginPage(driver);
	addProductToCart=new AddProductDetailsPage(driver);
	checkOutOrder=new CheckoutOrderPage(driver);
		
}

@Test
public void CheckoutProduct() throws IOException
{
	loginpage.loginWithCorrectCredential("nilamaran123456@gmail.com", "hello@123");
	addProductToCart.ClickProduct();
	addProductToCart.selectCategory();
	addProductToCart.selectProductToCart();
	addProductToCart.ViewCart();
	checkOutOrder.proceedToCheckout();
	checkOutOrder.placeorder();
	checkOutOrder.PaymentDetails("debit", "1234567890", "345", "12", "2028");
	Boolean verifyOrder=driver.findElement(By.xpath("//*[text()='Congratulations! Your order has been confirmed!'] ")).isDisplayed();
	Assert.assertTrue(verifyOrder, "Order is not suceesful!");
}
}
