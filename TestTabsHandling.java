package com.Test;

import com.Pages.TabsHandling;

public class TestTabsHandling {

	public static void main(String[] args) {
		
		TabsHandling objTabsHandling = new TabsHandling();
		objTabsHandling.initializeBrowser("https://demoqa.com/tabs");
		objTabsHandling.getTabsList();
		objTabsHandling.clickOnTab("Origin");

	}

}
