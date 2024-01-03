package WebdriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		Dimension d=new Dimension(1000,2000);
		
		driver.manage().window().setSize(d);
	}
}

