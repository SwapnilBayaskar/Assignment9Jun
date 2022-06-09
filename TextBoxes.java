package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseTest;

public class TextBoxes extends BaseTest {
	
	public void setFullName(String strName) {
		
		//Relative XPath - Forward traversing
		WebElement FullNameField = driver.findElement(By.xpath("//div[@id='userName-wrapper']/div[@class='col-md-9 col-sm-12']/input"));
		FullNameField.sendKeys(strName);
	}
	
	public void setEmail(String strEmail) {
		
		//Relative XPath - Following-sibling, child
		WebElement EmailField = driver.findElement(By.xpath("//div[@id='userName-wrapper']/following-sibling::div/child::div[@class='col-md-9 col-sm-12']/input"));
		EmailField.sendKeys(strEmail);
	}
	
	public void setAddress(String strAddress) {
		
		//Relative XPath - preceding-sibling, child
		WebElement AddressField = driver.findElement(By.xpath("//div[@id='permanentAddress-wrapper']/preceding-sibling::div[1]/child::div/textarea"));
		AddressField.sendKeys(strAddress);
	}
	
	public void setPermanentAddress() {
		
		WebElement AddressField = driver.findElement(By.xpath("(//div[@class='col-md-9 col-sm-12'])[3]"));
		String strAddress = AddressField.getText();
		System.out.println(strAddress);
		
		//Relative XPath - following-sibling
//		WebElement PermanentAddress = driver.findElement(By.xpath("(//div[@class='col-md-3 col-sm-12'])[4]/following-sibling::div"));
//		PermanentAddress.sendKeys(strAddress);
	}
	
	public void clickOnSubmit() {
		
		//Absolute XPath - Starting node
		WebElement SubmitButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div/button"));
		SubmitButton.click();
	}

}
