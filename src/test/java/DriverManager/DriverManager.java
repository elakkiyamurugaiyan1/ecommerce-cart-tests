package DriverManager;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {

	public static WebDriver driver;
	
	public static void setup()  {
	

		ChromeOptions options = new ChromeOptions();
		  Map<String, Object> prefs = new HashMap<>();
	        prefs.put("credentials_enable_service", false);
	        prefs.put("profile.password_manager_enabled", false);
	        prefs.put("autofill.profile_enabled", false); // important: disables "save address" popup
	        options.setExperimentalOption("prefs", prefs);

	        // Optional: Incognito to avoid saved profile triggering the prompt
	        //options.addArguments("--incognito");
			driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	public static void tearDown()
	{
		driver.quit();
		
	}
}
