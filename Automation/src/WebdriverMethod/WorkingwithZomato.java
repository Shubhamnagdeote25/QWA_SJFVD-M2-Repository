package WebdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithZomato {
public static void main(String[] args) {
	WebDriver  driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	 
	driver.get("https://www.zomato.com/pune/collection");
	String title=driver.getTitle();
	System.out.println("the title of webpage is"+title);
	
	String currenturl=driver.getCurrentUrl();
	System.out.println("the current url of webpage is:"+currenturl);
	

	driver.close();
	
}
}
