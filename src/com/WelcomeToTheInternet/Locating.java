package com.WelcomeToTheInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;
import utils.Constants;

public class Locating extends CommonMethods {

	public static void main(String[] args) {

		setUp("chrome", Constants.welcomeToTheInternetUrl);

		// WebElement partialLinkText = driver.findElement(By.partialLinkText("Chec"));
		// partialLinkText.click();

		// locating element using linkText locator
		// driver.findElement(By.linkText("Dropdown")).click();

		driver.findElement(By.linkText("Checkboxes")).click();
		WebElement chkBox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		chkBox1.click();

		if (chkBox1.isSelected()) {

			System.out.println("Check box 1 was selected");
		} else {

			System.err.println("Check box 1 WAS NOT SELECTED - please re-run");
		}

		
	}

}
