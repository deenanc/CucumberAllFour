package com.saucelabs.login.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SLCommonSteps {
	
	WebDriver driver;
	
	@Before
	public void setUp() {
//		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.edge.driver", "D:\\driver\\edgedriver_win64\\msedgedriver.exe");
		driver=new EdgeDriver();
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	public WebDriver getDriver() {
		return driver;
	}

}
