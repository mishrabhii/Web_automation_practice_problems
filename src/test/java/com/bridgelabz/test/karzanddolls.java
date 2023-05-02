package com.bridgelabz.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class karzanddolls extends BaseClass {


	@Test

	public void carsModel() throws InterruptedException, IOException {
		driver.get("https://www.karzanddolls.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		Actions act = new Actions(driver);

		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/button")).click();
		Thread.sleep(3000);
	

		WebElement tsmModelCars = driver.findElement(By.xpath("/html/body/header/div[2]/nav/div/ul/li[11]/a"));
		Thread.sleep(3000);
		act.moveToElement(tsmModelCars).perform();
		Thread.sleep(3000);
		screenshot();

		WebElement miniGT = driver.findElement(By.xpath("/html/body/header/div[2]/nav/div/ul/li[11]/div/div/div/div/ul[1]/a"));
		Thread.sleep(3000);
		miniGT.click();
		screenshot();

		Thread.sleep(3000);
		WebElement page2 = driver.findElement(By.xpath("/html/body/section[2]/div[2]/div/div[2]/div[2]/ul/li[2]/a"));
		Thread.sleep(3000);
		act.moveToElement(page2).perform();
		Thread.sleep(3000);
		page2.click();
		Thread.sleep(4000);
		screenshot();

		WebElement porsche = driver.findElement(By.xpath("/html/body/section[2]/div[2]/div/div[2]/div[1]/div[21]/div/div[5]/span[1]/button"));
		Thread.sleep(3000);
		act.moveToElement(porsche).perform();
		Thread.sleep(3000);
		porsche.click();
		Thread.sleep(3000);
		screenshot();

		WebElement element5 = driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div[1]/a"));
		Thread.sleep(3000);
		act.moveToElement(element5).perform();
		Thread.sleep(3000);
		element5.click();
		Thread.sleep(3000);
		screenshot();

	}

	public void screenshot() throws IOException {
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("/Users/atulnigam/Documents/AbhiEclipseWorkshop/CFP_216_Selenium_Practice_Problems/Screenshot/addToCart.jpg");
		FileUtils.copyFile(srcFile, dest);
		
	}
}
