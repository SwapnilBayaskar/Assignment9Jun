package com.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseTest;

public class TabsHandling extends BaseTest{
	
	public void getTabsList() {
		
		List<WebElement> TabList = driver.findElements(By.xpath("//nav[@class='nav nav-tabs']/a"));
		System.out.println("Size of the tab list : "+TabList.size());
		System.out.println("Available tabs on the page : ");
		
		for(WebElement TabName : TabList) {
			String strValue = TabName.getText();
			System.out.println(strValue);
		}
	}
	
	public void clickOnTab(String strTab) {
		
		List<WebElement> TabList = driver.findElements(By.xpath("//nav[@class='nav nav-tabs']/a"));
		
		for(WebElement TabName : TabList) {
			String strValue = TabName.getText();
			
			if(strValue.contains(strTab)) {
				TabName.click();
				System.out.println("Clicked on "+strTab+" Tab");
				break;
			}
	
		}
	}

}
