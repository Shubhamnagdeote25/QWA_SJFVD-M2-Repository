package WebdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithGetPageSource {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.amazon.com/");
	     
	     String sc=driver.getPageSource();
	     System.out.println(sc);
	     
	}
}
