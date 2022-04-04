package actionsclass;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;


public class ToolTipMessage {

 public static void main(String[] args) throws InterruptedException {

 
  WebDriver driver;

  System.setProperty("webdriver.chrome.driver",

    "C:\\selenium\\chromedriver_win32\\chromedriver.exe");

  driver = new ChromeDriver();

  driver.manage().window().maximize();

  driver.get("https://www.google.co.in/");

  Thread.sleep(1000);
  
  Actions act= new Actions(driver);
 
  WebElement mouseHover=driver.findElement(By.name("q"));
  
  Thread.sleep(1000);
  
  act.moveToElement(mouseHover).perform();
  
  String tooltipMsg=mouseHover.getAttribute("title");
  
  System.out.println("Tooltip Message is: "+tooltipMsg);

 
  driver.close();

 }

}