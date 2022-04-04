package seleniumprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOptionsSorting {

	public static void main(String []args)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
	
	WebElement ele=driver.findElement(By.id("animals"));
	
	Select se = new Select(ele);
	se.selectByVisibleText("Avatar");
	
	List<WebElement> options =se.getOptions();
	
	List original=new ArrayList();
	
	List templist=new ArrayList();
	
	for(WebElement e:options)
		
	{
		original.add(e.getText());
		templist.add(e.getText());
	}
	
	System.out.println("Before sorting original list:"+original);
	System.out.println("Before sorting original list:"+templist);
	
	Collections.sort(templist);
	
	System.out.println("after sorting original list:"+original);
	System.out.println("after sorting original list:"+templist);
	
	if(original == templist)
	{
		System.out.println("drop down is sorted");
	}
	
	else
	{
		System.out.println("drop down is not sorted");
	}
	
	driver.close();
	
}

}
