package WebdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithGetCurrentUrl {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		String url=driver.getCurrentUrl();
		
		if(url.equals("https://www.amazon.in/"))
		{
			System.out.println("test case is pass");
			
		}
		else
		{
			System.out.println("test case is fail");
		}
		
		
	}
}
