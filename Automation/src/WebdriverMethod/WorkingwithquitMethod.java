package WebdriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithquitMethod {

	public static void main(String[] args) {
		 
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("// a[text()=open a popup window]")).click();
		
		driver.quit();
		 
	}
}
