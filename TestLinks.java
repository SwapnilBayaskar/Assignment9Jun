package com.Test;

import com.Pages.Links;

public class TestLinks {

	public static void main(String[] args) {
		
		Links objLinks = new Links();
		
		objLinks.initializeBrowser("https://demoqa.com/links");
		objLinks.clickOnLinks("bad-request");
		objLinks.setImplicitWait(5);
		objLinks.printResponseLink();
		objLinks.verifyResponse("Bad Request");
		objLinks.verifyResponseCode("400");

	}

}
