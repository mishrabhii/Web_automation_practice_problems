package com.bridgelabz.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrokenLinks extends BaseClass {

	
@Test

	public void brokenLinks() throws IOException {

	driver.get("http://www.amazon.com");

	List<WebElement> links = driver.findElements(By.tagName("a"));
	
	System.out.println("No of links = "+ links.size());
	List<String> urlList = new ArrayList<String>();
	
	for (WebElement e : links) {
		String url = e.getAttribute("href");		
		checkBrokenLinks(url);
	}
		
		driver.quit();
		
	}

	public static void checkBrokenLinks(String linkUrl) {
		try {
		URL url = new URL(linkUrl);
		HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
		httpUrlConnection.setConnectTimeout(5000);
		httpUrlConnection.connect();
		
		if(httpUrlConnection.getResponseCode()>=400) {
			System.out.println(linkUrl +"--------->" + httpUrlConnection.getResponseMessage() + "is a broken link");
		}
		else{
				System.out.println(linkUrl +"--------->" + httpUrlConnection.getResponseMessage());
			
				}

		}
		catch (Exception e) {
			
		}
}
}
