package com.bridgelabz.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PopUp extends BaseClass {
	@Test

	public void simpleAlert() throws InterruptedException {
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("alertbox")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);

	}
	@Test
	public void confirmAlert() throws InterruptedException {
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("alertbox")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);

	}

}
