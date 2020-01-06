package com.WelcomeToTheInternet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {

		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://the-internet.herokuapp.com/");
	}

}
