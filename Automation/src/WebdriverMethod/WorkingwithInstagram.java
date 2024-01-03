package WebdriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithInstagram {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		String sc=driver.getTitle();
		System.out.println(sc);
		
		driver.findElement(By.name("username")).sendKeys("shubhamnagdeote@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Shubham123");
		
		driver.findElement(By.className("_acan")).click();
		
		//driver.quit();
		 
	}
}
