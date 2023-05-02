package com.bridgelabz.test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class InSink extends BaseClass {
	@Test

	public void insink() throws InterruptedException {
		driver.get("https://insinkerator.emerson.com/en-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		WebElement element1 =driver.findElement(By.xpath("/html/body/div[2]/header/nav[2]/div/div[3]/div[1]/a"));
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.moveToElement(element1).perform();
		Thread.sleep(1000);
		WebElement element2 =driver.findElement(By.xpath("/html/body/div[2]/header/nav[2]/div/div[3]/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/a"));
		element2.click();
		Thread.sleep(2000);
		WebElement element4= driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/form/div/div/div/h2/strong"));
		act.moveToElement(element4);
		//	act.moveByOffset(0, 350).perform();
		//	Thread.sleep(2000);
		//driver.manage().window(Keys.)
		WebElement element3 = driver.findElement(By.id("fe2109"));

		//act.moveToElement(element3);
		element3.click();
		Select sl = new Select(element3);
		sl.selectByValue("IN-UP");
		Thread.sleep(3000);

		WebElement element5= driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/nav/div/ul/li[2]/a"));
		element5.click();
		Thread.sleep(5000);

	}
	@Test
	public void residence () throws InterruptedException {
		driver.get("https://insinkerator.emerson.com/en-in/products/residential");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		
		Actions acto = new Actions(driver);
		WebElement element1 = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/div[3]/div[2]/div/div/div/table/thead/tr/th[4]/h3/a"));
		Thread.sleep(5000);
		acto.moveToElement(element1);
		Thread.sleep(5000);
		element1.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> itrt = windowHandles.iterator();
		String parentWin = itrt.next();
		String childWin = itrt.next();
		
		driver.switchTo().window(childWin);
	
		WebElement element2 = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/div[19]/div/div/div[2]/div[2]/div/div/div/div/div/ul/li/a/div/span[1]"));
		Thread.sleep(5000);
		acto.moveToElement(element2);
		Thread.sleep(5000);
		element2.click();
		Thread.sleep(5000);
		
		
		
		//*[@id="doc-0-english-listbox"]/ul/li/a/div/span[1]
	//	/html/body/div[4]/div/div/div[3]/div[19]/div/div/div[2]/div[2]/div/div/div/div/div/ul/li/a/div/span[1]
		
		
		
		
		
		
		
		
		
//		Actions acto = new Actions(driver);
//		
//		
//		WebElement element7= driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/div[1]/div/div/div[1]/div/div[4]/div/div[1]/div/a/div/img"));
//
//		acto.moveToElement(element7);
//		Thread.sleep(5000);
//		element7.click();
//		Thread.sleep(10000);
//
//
//		WebElement element8= driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/div[19]/div/div/div[2]/div[2]/div/div/div/div/div/ul/li/a/div/span[1]"));
//		Thread.sleep(5000);
//		acto.moveToElement(element8);
//		Thread.sleep(10000);
//		element8.click();
//		Thread.sleep(5000);
		
	}

}
