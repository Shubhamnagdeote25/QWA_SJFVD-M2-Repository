package implictwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithImplicitWait {
	
 public static void main(String[] args) {
	  WebDriver driver=new ChromeDriver();
	  
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=9qn8e4s4nafhj");
		
      driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Manager");
      driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("Shubham@123");
      driver.findElement(By.id("loginButton")).click();
     
      
      driver.findElement(By.xpath("//a[@class='content tasks']")).click();
      driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
      driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
      
      driver.findElement(By.xpath("//input[@name='name']")).sendKeys("mahesh");
      driver.findElement(By.name("createCustomerSubmit")).click();
      
}
}
