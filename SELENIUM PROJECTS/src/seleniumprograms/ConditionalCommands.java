package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {
	public static void main(String []args)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	WebElement usename=driver.findElement(By.id("txtUsername"));
	WebElement password=driver.findElement(By.id("txtPassword"));
	
	
	if(usename.isDisplayed() && usename.isEnabled())
	{
		usename.sendKeys("Admin");
	}
	
	if(password.isDisplayed() && password.isEnabled())
	{
		password.sendKeys("admin123");
	}
	
	//isSelected is also a conditional command
	driver.close();

}
}
