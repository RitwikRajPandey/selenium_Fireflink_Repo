package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class appleEX {

	@Test (groups = "smoke")    //for group execution 
	public void login() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.apple.com/");
	}
}
