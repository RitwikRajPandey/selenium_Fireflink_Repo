package webDrivers;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchEmptyBrowser {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.chrome.com/");
		
	}
}
