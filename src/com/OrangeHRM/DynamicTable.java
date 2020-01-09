package com.OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;
import utils.Constants;

public class DynamicTable extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// calling setUp() method to initialize WebDriver and opening URL
		setUp("chrome", Constants.HRMS_URL);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		// a[@id='menu_recruitment_viewRecruitmentModule']/b
		// *[@id="menu_recruitment_viewRecruitmentModule"]/b
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']")).click(); 
		// first lets find
		// the number of
		// rows present
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		int numberOfRows = rows.size();
		System.out.println("There are " + numberOfRows + " rows present");
		// *[@id="resultTable"]/tbody/tr[1]/td[3]/a
		// *[@id="resultTable"]/tbody/tr[2]/td[3]/a
		// *[@id="resultTable"]/tbody/tr[3]/td[3]/a
		// *[@id="resultTable"]/tbody/tr[4]/td[3]/a
		String firstHalfXpath = "//*[@id='resultTable']/tbody/tr[";
		String secondHalfXpath = "]/td[3]/a";
		// less than
		for (int i = 1; i <= numberOfRows; i++) {
			String namePresent = driver.findElement(By.xpath(firstHalfXpath + i + secondHalfXpath)).getText();
			// System.out.println();
			System.out.println(namePresent);
			if (namePresent.contains("Syntax")) {
				 //input[@type='checkbox']
				 //table[@id='resultTable']/tbody/tr[2]/td[1]
				driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[1]")).click();
				break;
			} else {
				System.out.println("Text not present");
			}
		}

	}

}
