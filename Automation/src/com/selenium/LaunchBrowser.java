package com.selenium;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
	
	static WebDriver driver;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Browser Name");
        String browser=sc.next();
		if(browser.equals("chrome"))
		{
			driver =new ChromeDriver();
		}
		else if(browser.equals("edge"))  
		{
             driver = new EdgeDriver();
		}
		else {
	        System.out.println("Invalid Browser");
		}
	}

}