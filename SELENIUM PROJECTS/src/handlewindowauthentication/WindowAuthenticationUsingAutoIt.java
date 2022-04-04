package handlewindowauthentication;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAuthenticationUsingAutoIt {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		  
		  WebDriver driver;
		  System.setProperty("webdriver.chrome.driver",
		    "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://the-internet.herokuapp.com/basic_auth");
		  Runtime.getRuntime().exec("C:\\Users\\mekal\\Desktop\\AUTH1.exe");
		 
		        //driver.close();
		 }
		}


