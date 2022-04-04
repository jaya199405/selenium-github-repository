package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAndRadioButtons {

    public WebDriver driver;

    public void launch() throws InterruptedException {

         System.setProperty("webdriver.chrome.driver",
                  "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
         Thread.sleep(2000);
    }

    public void radioBtnDemo() throws InterruptedException {

         WebElement radioBtn = driver.findElement(By.xpath("//input[@type='radio' and @value='Male']"));
         radioBtn.click();
         System.out.println("Male radio btn is Selected: "+radioBtn.isSelected());
         Thread.sleep(2000);
    }
   
    public void checkBoxDemo(String hobby) throws InterruptedException {
        
         //WebElement chekBox=driver.findElement(By.xpath("//input[@type='checkbox' and @value='Drawing']"));
         //chekBox.click();
         //Thread.sleep(2000);
        
         List<WebElement> list= driver.findElements(By.xpath
                  ("//input[@type='checkbox' and @name='Hobby']"));
        
         for(int i=0; i<list.size();i++) {
            
             WebElement ele=list.get(i);
             String hobbies=ele.getAttribute("value");
             //System.out.println(hobbies);
             if(hobbies.contains("Dancing")) {
                  ele.click();
                  Thread.sleep(2000);
                  break;
             }
         }
        
    }
   

    public void closeBrowser() {
         driver.close();
    }

    public static void main(String[] args) throws InterruptedException {
    	CheckBoxAndRadioButtons obj = new CheckBoxAndRadioButtons();
         obj.launch();
         obj.radioBtnDemo();
       obj.checkBoxDemo("Others");
       //obj.closeBrowser();
    }

}
