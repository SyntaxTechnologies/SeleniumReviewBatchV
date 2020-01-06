package com.WelcomeToTheInternet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;
import utils.Constants;

public class FindElementAndFindElements extends CommonMethods {

	public static void main(String[] args) {

		setUp("chrome", Constants.welcomeToTheInternetUrl);

		// driver.findElement(By.linkText("Checkboxes")).click();

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int numberOfAllLinks = allLinks.size();

		System.out.println(numberOfAllLinks);

		// Next step is to get the text and hyperlinks of all links on the web page
		// using getText() method and getAttribute() method

		for (WebElement link : allLinks) {

			System.out.println(link.getText() + " = " + link.getAttribute("href"));
		}

		driver.quit();

	}

}
