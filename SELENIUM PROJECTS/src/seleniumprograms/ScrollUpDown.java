package seleniumprograms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

 public static void main(String[] args) throws InterruptedException {
  
  WebDriver driver;
  System.setProperty("webdriver.chrome.driver",
    "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.get("https://www.automationtestinginsider.com/");
  JavascriptExecutor js= (JavascriptExecutor) driver;
  js.executeScript("window.scrollBy(1000,0)");
 }
}