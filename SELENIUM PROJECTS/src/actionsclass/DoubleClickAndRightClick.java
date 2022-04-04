package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAndRightClick {
	
	public static void main(String[] args) throws InterruptedException {

		 
		  WebDriver driver;

		  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");

		  driver = new ChromeDriver();

		  driver.manage().window().maximize();

		  driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");

		  Thread.sleep(1000);  

		  WebElement doubleClickBtn= driver.findElement(By.id("doubleClickBtn"));

		  WebElement rightClickBtn= driver.findElement(By.id("rightClickBtn"));  

		  Actions act= new Actions(driver);  

		  act.doubleClick(doubleClickBtn).perform();

		  System.out.println("Double clicked");

		  driver.switchTo().alert().accept();

		  Thread.sleep(2000);

		  act.contextClick(rightClickBtn).perform();
       
		  System.out.println("Right clicked");

		  driver.close();

		 }

		}


