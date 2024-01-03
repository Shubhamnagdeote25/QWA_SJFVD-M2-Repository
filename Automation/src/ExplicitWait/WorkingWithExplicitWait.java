package ExplicitWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/");
		
		driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4 ']")).click();
		
		driver.findElement(By.id("Check Delivery")).sendKeys("530125");
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		
		driver.findElement(By.id("Check")).click();
		
		
		
		
	}
}
