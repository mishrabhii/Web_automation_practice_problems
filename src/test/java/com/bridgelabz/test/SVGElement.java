package com.bridgelabz.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SVGElement extends BaseClass {
	
	@SuppressWarnings("unchecked")
	@Test
	
	public void svg() {
		driver.get("https://www.google.com/search?q=weather+in+bangalore&rlz=1C5CHFA_enIN988IN988&sxsrf=APwXEdeX3LvUnARsARNQC9wakH9iP7npKA%3A1680603212296&ei=TPgrZLDJEamQseMP_NS4wAs&oq=weather+&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQARgAMg4IABCKBRCxAxCDARCRAjIICAAQigUQkQIyCwgAEIAEELEDEIMBMggIABCKBRCRAjIOCAAQgAQQsQMQgwEQyQMyCwgAEIAEEJIDEMsBMggIABCKBRCSAzILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMgoIABCABBAUEIcCOgoIABBHENYEELADOg0IABBHENYEEMkDELADOgsIABCKBRCSAxCwAzoKCAAQigUQsAMQQ0oECEEYAFDzA1jzA2DiDWgBcAF4AIABa4gBa5IBAzAuMZgBAKABAcgBCsABAQ&sclient=gws-wiz-serp");
		List<WebElement> list = (List<WebElement>) driver.findElement(By.xpath("(//*[local-name()='svg' and @class = \"wob_gsvg\" ])[1]//*[name()= 'text']"));
		Actions act = new Actions(driver);
		for(WebElement e : list) {
			act.moveToElement(e).perform();
		}
		
	}

}
