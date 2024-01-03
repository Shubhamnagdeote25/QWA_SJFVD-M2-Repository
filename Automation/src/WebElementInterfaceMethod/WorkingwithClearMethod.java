package WebElementInterfaceMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

        public class WorkingwithClearMethod {

		public static void main(String[] args)throws InterruptedException {
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("27.0.0.1/login.do;jsessionidhttp://1=9qn8e4s4nafhj");
			
	            WebElement username = driver.findElement(By.name("username"));
	            
	            username.sendKeys("admin");
	             Thread.sleep(2000);
	             
	             username.clear();
	             Thread.sleep(2000);
	             
	             username.sendKeys("admin123");
	             
	           
	           
	            
		}
	}


