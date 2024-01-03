package WebdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
public class MaximizedBrowser {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
      //	options opt=driver.manage();
        //	window win=opt.window();
		// win.maximize();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
	}

}
