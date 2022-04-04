package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		String exptitle=driver.getTitle();
		
		System.out.println(exptitle);
		
		String actualtitle="OrangeHRM";
		
		if(exptitle.equals(actualtitle)==true)
			
		{
			
			System.out.println("test is passed");
		}
		
		else
		{
			System.out.println("test is failed");
		}
	     driver.close();
	}

}
