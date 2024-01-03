package WebdriverMethod;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWthGetMethods {

	public static void main(String[] args)throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//String sc=driver.getTitle();
         //System.out.println(sc);
		//String sc=driver.getCurrentUrl();
		//System.out.println("the current url is"+sc);
		//driver.close();
		//driver.switchTo().activeElement().sendKeys("shoes",Keys.ENTER);
		driver.navigate().to("https://www.amazon.com/");
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		 
		driver.quit();
		
	}
}
