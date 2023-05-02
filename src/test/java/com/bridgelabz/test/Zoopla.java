package com.bridgelabz.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Zoopla extends BaseClass{
	
	@Test
	
	public void testZoopla () throws InterruptedException {
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@placeholder = 'e.g. Oxford or NW3']")).sendKeys("London");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/div[1]/div/div/div[1]/div[2]/div/div/div[2]/div/form/div/div[2]/button/div/div[2]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[1]/div[6]/label/input")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("downshift-30-toggle-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"downshift-30-item-1\"]/div[2]")).click();
		Thread.sleep(1000);
		WebElement houses = driver.findElement(By.xpath("//*[@id=\"splide03-slide01\"]/picture/img"));
		Actions act = new Actions(driver);
		act.moveToElement(houses);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div[1]/div[13]/div/section/div/div[1]/div/a")).click();
		Thread.sleep(2000);
		
		WebElement text=driver.findElement(By.xpath("//*[@id=\"listing_64157330\"]/div/div[1]/div/a[1]/img"));
		System.out.println("getting text is ="+ text.getText());
		Thread.sleep(2000);
	}

}
