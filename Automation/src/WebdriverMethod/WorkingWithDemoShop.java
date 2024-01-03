
	package WebdriverMethod;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class WorkingWithDemoShop {

		public static void main(String[] args) {
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demowebshop.tricentis.com/");
			
			driver.findElement(By.linkText("Register")).click();
	        

			driver.findElement(By.name("FirstName")).sendKeys("shubham");
			driver.findElement(By.name("LastName")).sendKeys("Nagdeote");
			driver.findElement(By.name("Email")).sendKeys("shubhamnagdeote@gmail.com");
			driver.findElement(By.name("Password")).sendKeys("Shubham123");
			driver.findElement(By.name("ConfirmPassword")).sendKeys("Shubham123");
	
		
		
		}
	}


