package WebdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithGetTitleMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		 
		driver.get("https://www.amazon.in/");
		
		String sc=driver.getTitle();
	      System.out.println(sc);
	      if (sc.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
	      		))
	      {
	    	  System.out.println("test case is pass");
	      }
	      else
	      {
	    	  System.out.println("test case is fail");
	      }
	}
	
}
