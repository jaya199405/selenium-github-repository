package headlesstesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxHeadlessTest {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver\\geckodriver.exe");
		FirefoxOptions options=new FirefoxOptions();
	    //options.addArguments("--headless");
		options.setHeadless(true);
		
		WebDriver driver=new FirefoxDriver(options);
		
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	    System.out.println(driver.getTitle());
} 


}
