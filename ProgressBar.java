package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseTest;

public class ProgressBar extends BaseTest{
	
	public void startProgressBar() {
		
		WebElement Button = driver.findElement(By.xpath("//button[@id='startStopButton']"));
		Button.click();
	}
	
	public void stopProgressBar() {
		
		WebElement Button = driver.findElement(By.xpath("//button[@id='startStopButton']"));
		Button.click();
	}
	
	public void getProgressPercentage() {
		
		WebElement ProgressBar = driver.findElement(By.xpath("//div[@class='progress-bar bg-info']"));
		String strPercentage = ProgressBar.getText();
		
		if(strPercentage==null) {
			System.out.println("No Progress happened");
		}else {
			System.out.println("Progress Percentage : "+strPercentage);
		}
	}

}
