package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByVisibilityOfElement {

 public static void main(String[] args) throws InterruptedException {
  
  WebDriver driver;
  System.setProperty("webdriver.chrome.driver",
    "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
  Thread.sleep(2000);
  JavascriptExecutor js= (JavascriptExecutor) driver;
  WebElement ele=driver.findElement(By.id("simpleAlert"));
  js.executeScript("arguments[0].scrollIntoView()",ele );
 }
}