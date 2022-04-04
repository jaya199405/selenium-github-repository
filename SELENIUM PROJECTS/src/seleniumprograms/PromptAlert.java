package seleniumprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	
	public static void main(String[] args) throws InterruptedException {

		  WebDriver driver;
		  System.setProperty("webdriver.chrome.driver",
		    "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		  Thread.sleep(2000);
		  driver.findElement(By.id("promptAlert")).click();
		  Alert alert = driver.switchTo().alert();
		  String alertText = alert.getText();
		  System.out.println("Alert Text is: " + alertText);
		  alert.sendKeys("Yes");
		  Thread.sleep(2000);
		  alert.accept();
		  driver.close();
		 }

}
