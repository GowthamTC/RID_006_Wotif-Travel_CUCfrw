package org.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	public static WebElement element;
	
	public static void launchingBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();	
		
	}
	
	public static void maxwindow() {
		
		driver.manage().window().maximize();
	}
	
	public static void loadurl(String url) {
		
		driver.get(url);
			
	}
	
	public static void fill(WebElement elements,String userText) {
		
		elements.sendKeys(userText);	
			
	}
	
	public static void clickbutton(WebElement button) {
		
		button.click();
	}

}
