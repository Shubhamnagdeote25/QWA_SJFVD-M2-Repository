package WebdriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDemoShop1 {

	public static void main(String[] args) {
		 
		WebDriver driver=new ChromeDriver();
		
	   driver.manage().window().maximize();
	   
	   driver.get("https://demowebshop.tricentis.com/");
	   
	   driver.findElement(By.linkText("Log in")).click();
	   
	   driver.findElement(By.name("Email")).sendKeys("shubhamnagdeote@gmail.com");
	   driver.findElement(By.name("Password")).sendKeys("shubham123");
	   driver.findElement(By.className("button-1")).click();
	}
}
