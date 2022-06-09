package com.Test;

import com.Pages.ProgressBar;

public class TestProgressBar {

	public static void main(String[] args) throws InterruptedException {
		
		ProgressBar objProgressBar = new ProgressBar();
		
		objProgressBar.initializeBrowser("https://demoqa.com/progress-bar");
		objProgressBar.startProgressBar();
		objProgressBar.setImplicitWait(50);
		//Thread.sleep(500);
		objProgressBar.stopProgressBar();
		
		objProgressBar.getProgressPercentage();

	}

}
