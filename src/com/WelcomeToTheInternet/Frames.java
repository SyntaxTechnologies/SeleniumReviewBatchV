package com.WelcomeToTheInternet;

import org.openqa.selenium.By;

import utils.CommonMethods;
import utils.Constants;

public class Frames extends CommonMethods {

	public static void main(String[] args) {

		setUp("chrome", Constants.welcomeToTheInternetUrl);

		driver.findElement(By.linkText("Frames")).click();

		driver.findElement(By.linkText("iFrame")).click();

		switchToFrame("mce_0_ifr");

		driver.findElement(By.xpath("//body[@id='tinymce']/p")).clear();

		driver.findElement(By.xpath("//body[@id='tinymce']/p")).sendKeys("I will get a job in a couple of months");

	}

}
