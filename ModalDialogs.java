package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseTest;

public class ModalDialogs extends BaseTest{
	
	public void clickOnSmallDialogButton() {
		
		WebElement smallDialog = driver.findElement(By.xpath("//button[@id='showSmallModal']"));
		smallDialog.click();
	}
	
	public void getSmallModalHeading() {
		
		WebElement SmallHeading = driver.findElement(By.xpath("//div[@class='modal-title h4']"));
		String strHeadingValue = SmallHeading.getText();
		
		System.out.println("Heading of Small dialog : "+strHeadingValue);
	}
	
	public void closeSmallModal() {
		
		WebElement CloseButton = driver.findElement(By.xpath("//button[@id='closeSmallModal']"));
		CloseButton.click();
	}

}
