 package org.PojoClass;

import org.BaseClass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoingToPojo extends Baseclass {
	
	public GoingToPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({
		@FindBy(xpath="//button[@aria-label='Going to']"),
		@FindBy(xpath="(//button[@class='uitk-fake-input uitk-form-field-trigger'])[1]")
	})
	
	private WebElement GoingTo;
	
	@FindAll({
		@FindBy(xpath="(//button[@type='submit'])[1]"),
		@FindBy(xpath="//button[@data-testid='submit-button']")
	})
	
	private WebElement clickSearch;

	public WebElement getGoingTo() {
		return GoingTo;
	}

	public WebElement getClickSearch() {
		return clickSearch;
	}

}
