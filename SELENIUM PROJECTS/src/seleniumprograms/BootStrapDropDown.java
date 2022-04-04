package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {
	
	public static void main(String []args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.automationtestinginsider.com/2019/12/bootstrap-dropdown-example_12.html");
	driver.findElement(By.id("bootstrapmenu")).click();
	List<WebElement> options=driver.findElements(By.xpath("//ul[@class=\"dropdown-menu\"]//li/a"));
	
	for(WebElement ele : options)
	{
		String value=ele.getText();
		System.out.println(value);
		
		if(value.equalsIgnoreCase("home"))
		{
			ele.click();
			String selectedvalue=ele.getText();
			System.out.println(selectedvalue);
		}
	}
	
	   Thread.sleep(2000);
	
	 // driver.close();

	}
}
 