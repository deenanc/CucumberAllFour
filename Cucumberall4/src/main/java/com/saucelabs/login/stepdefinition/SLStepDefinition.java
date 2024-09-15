package com.saucelabs.login.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.saucelabs.login.pageobjects.SLPageObject;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SLStepDefinition extends SLPageObject{
	
	WebDriver driver;
	
	public SLStepDefinition(SLCommonSteps commonSteps) {
		this.driver=commonSteps.getDriver();
		PageFactory.initElements(driver, SLPageObject.class);
	}
	
	
	@Given("User is in Swag Labs Login Page")
	public void user_is_in_swag_labs_login_page() {
	    driver.navigate().to("https://www.saucedemo.com/v1/");
	    driver.manage().window().maximize();
	}

	@Then("User enters username and password and clicks login button")
	public void user_enters_username_and_password_and_clicks_login_button() {
		username.sendKeys("visual_user");
	    password.sendKeys("secret_sauce");
	    loginButton.click();
	}

	@Then("User enter {string} and {string} and clicks login button")
	public void user_enter_and_and_clicks_login_button(String username1, String password1) {
		username.sendKeys(username1);
	    password.sendKeys(password1);
	    loginButton.click();
	}

	@Then("User enters username and password and clicks login button TC3")
	public void user_enters_username_and_password_and_clicks_login_button_tc3(DataTable dataTable) {
	    List<List<String>> credentials=dataTable.asLists(String.class);
	    String username3=credentials.get(0).get(0);
	    String password3=credentials.get(0).get(1);
	    
	    username.sendKeys(username3);
	    password.sendKeys(password3);
	    loginButton.click();
	}

	@Then("User enters username and password and clicks login button TC4")
	public void user_enters_username_and_password_and_clicks_login_button_tc4(DataTable dataTable) {
	    List<Map<String,String>> credentials4=dataTable.asMaps(String.class, String.class);
	    String us4=credentials4.get(0).get("Username4");
	    String pw4=credentials4.get(0).get("Password4");
	    
	    username.sendKeys(us4);
	    password.sendKeys(pw4);
	    loginButton.click();
	}

	@Then("User enters {string} and {string} and clicks login button TC5")
	public void user_enters_and_and_clicks_login_button_tc5(String username5, String password5) {
	    username.sendKeys(username5);
	    password.sendKeys(password5);
	    loginButton.click();
	}

	
	
	

}
