package PopUps;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class authenticationPopup {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");  //https://Username:Password@--url--
	    

	}

}
