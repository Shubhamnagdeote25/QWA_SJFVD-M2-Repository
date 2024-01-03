package WebdriverMethod;
 
 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithGetMethod {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		
		String actual_title = driver.getTitle();
		//System.out.println("the title of current webpage is"+actual_title);
		
		if(actual_title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!\r\n"))
		{
			System.out.println("test case is pass");
		}	
		else
		{
			System.out.println("test case is fail");
		}
		
	
		
	}

}
