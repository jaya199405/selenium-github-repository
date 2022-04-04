package seleniumprograms;

	import java.util.Iterator;
	import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class WindowHandles {

	 public static void main(String[] args) throws InterruptedException {

	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver",
	    "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  // To open Naukri.com with multiple windows
	  driver.get("https://www.automationtestinginsider.com/p/selenium-vi.html");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//span[text()='Selenium and it’s History']")).click();
	   Thread.sleep(1000);
	  // It will return the parent window name as a String
	  String parentWinID = driver.getWindowHandle();
	  System.out.println("Parent Win ID is: " + parentWinID);
	  // It returns no. of windows opened by WebDriver and will return Set of Strings
	  Set<String> allWinID = driver.getWindowHandles();
	  System.out.println("Total Window size:" +allWinID.size());
	  System.out.println("All win IDs are:");
	  for (String allIDs : allWinID) {
	   System.out.println(allIDs);
	  }
	  // Using Iterator to iterate with in windows
	  Iterator<String> itr = allWinID.iterator();
	  while (itr.hasNext()) {
	   String childWinID = itr.next();
	   // Compare whether the main window is not equal to child window. If not equal, we will close child windows.
	              if(!parentWinID.equalsIgnoreCase(childWinID)) {
	               driver.switchTo().window(childWinID);
	               System.out.println("Child URL is:"+driver.getCurrentUrl());
	               System.out.println("Child Win Title is:"+driver.getTitle());
	               Thread.sleep(2000);
	               driver.close();
	              }
	  }
	  // This is to switch to the main window
	  driver.switchTo().window(parentWinID);
	  driver.quit();
	 }
	}


