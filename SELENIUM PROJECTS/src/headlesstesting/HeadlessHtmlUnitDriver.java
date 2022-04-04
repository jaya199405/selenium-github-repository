package headlesstesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessHtmlUnitDriver {
	
public static void main(String[] args) {
		
		
		
		HtmlUnitDriver driver=new HtmlUnitDriver();
		
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	    System.out.println(driver.getTitle());
}

}
