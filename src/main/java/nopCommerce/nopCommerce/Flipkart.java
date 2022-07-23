package nopCommerce.nopCommerce;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart 
{
public static void main(String args[])
{
	System.setProperty("webdriver.chrome.driver","C://drivers2//chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	//driver.findElement(By.xpath("//a[@class='_2KpZ6l _3dESVI'][text()='VIEW ALL']")).click();
	WebElement m=driver.findElement(By.xpath("//*[local-name()='svg'  ] [@class='']//*[local-name()='path'][@class='FXox6K']"));
	 Actions a = new Actions(driver);
     a.moveToElement(m).
     click().build().perform();
			
	

}


}
