package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseTest;

public class Links extends BaseTest{
	
	public void clickOnLinks(String strLink) {
		
		WebElement Link = driver.findElement(By.xpath("//a[@id='"+strLink+"']"));
		Link.click();
	}
	
	public void printResponseLink() {
		
		WebElement LinkResponse = driver.findElement(By.xpath("//p[@id='linkResponse']"));
		String strResponse = LinkResponse.getText();
		
		System.out.println("Response text is : "+strResponse);
	}
	
	public void verifyResponse(String strResponse) {
		
		WebElement LinkResponse = driver.findElement(By.xpath("//p[@id='linkResponse']"));
				
		if(LinkResponse.getText().contains(strResponse)) {
			System.out.println("Request is successfull");
		}else {
			System.out.println("Request is failed");
		}
	}
	
	public void verifyResponseCode(String strCode) {
		
		WebElement LinkResponse = driver.findElement(By.xpath("//p[@id='linkResponse']"));
		
		if(LinkResponse.getText().contains(strCode)) {
			System.out.println("Correct response code");
		}else {
			System.out.println("Incorrect response code");
		}
	}

}
