package com.Test;

import com.Pages.TextBoxes;

public class TestTextBoxes {

	public static void main(String[] args) {
		
		TextBoxes objTextBoxes = new TextBoxes();
		
		objTextBoxes.initializeBrowser("https://demoqa.com/text-box");
		objTextBoxes.setFullName("Swapnil Bayaskar");
		objTextBoxes.setEmail("swapnil@gmail.com");
		objTextBoxes.setAddress("404, ABC Heights, Pune, MH-18");
		objTextBoxes.setImplicitWait(5);
		objTextBoxes.setPermanentAddress();
		objTextBoxes.clickOnSubmit();

	}

}
