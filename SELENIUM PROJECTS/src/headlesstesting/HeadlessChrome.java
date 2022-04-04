package headlesstesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32//chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
	    //options.addArguments("--headless");
		options.setHeadless(true);
		
		WebDriver driver=new ChromeDriver(options);
		
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	    System.out.println(driver.getTitle());
}

}
