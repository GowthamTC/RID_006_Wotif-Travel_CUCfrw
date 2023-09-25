package org.StepDefinaction;

import org.BaseClass.Baseclass;
import org.PojoClass.GoingToPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinaction extends Baseclass{
	
	


@Given("To validate GoingTo function")
public void to_validate_GoingTo_function() {
    
	
}

@When("User have to in Wotif home page")
public void user_have_to_in_Wotif_home_page() {
	
	launchingBrowser();
	loadurl("https://www.wotif.com/");
	maxwindow();
	

	
}

@When("user have to click Goingto Tab")
public void user_have_to_click_Goingto_Tab() throws InterruptedException{
	
	GoingToPojo g=new GoingToPojo();
	
	g.clickbutton(g.getGoingTo());
	g.fill(g.getGoingTo(), "chennai");
	
	
}

@Then("User have to endter valid location")
public void user_have_to_endter_valid_location() {
	
	GoingToPojo g=new GoingToPojo();
	
	
   
	
	
}

@Then("user have to click search button")
public void user_have_to_click_search_button() {
	
	
	GoingToPojo g=new GoingToPojo();
	
	g.clickbutton(g.getClickSearch());
	
  
}



}
