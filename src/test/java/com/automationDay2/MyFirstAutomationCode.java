package com.automationDay2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstAutomationCode {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); //ctrl+shift+O will import drivers
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.quit();
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://reddit.com");
		driver1.quit();
		
		
		

	}

}
