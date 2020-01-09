package com.ToolsQA;

import org.openqa.selenium.By;

import utils.CommonMethods;
import utils.Constants;

public class Alert extends CommonMethods {

	public static void main(String[] args) {
		setUp("chrome", Constants.TOOLSQA_URL);
		driver.findElement(By.id("alert")).click();
		//acceptAlert();
		//driver.quit();
	}

}
