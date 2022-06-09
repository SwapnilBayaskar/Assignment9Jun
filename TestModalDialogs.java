package com.Test;

import com.Pages.ModalDialogs;

public class TestModalDialogs {

	public static void main(String[] args) {
		
		ModalDialogs objModalDialogs = new ModalDialogs();
		
		objModalDialogs.initializeBrowser("https://demoqa.com/modal-dialogs");
		objModalDialogs.clickOnSmallDialogButton();
		objModalDialogs.setImplicitWait(5);
		objModalDialogs.getSmallModalHeading();
		objModalDialogs.closeSmallModal();

	}

}
