package WebElementInterfaceMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClickMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/login.do;jsessionid=9qn8e4s4nafhj");
		WebElement button = driver.findElement(By.id("loginButton"));
		button.click();
        
	}
}
