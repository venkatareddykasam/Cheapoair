package com.cheapoair.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This Class contains Flights Page elements and its actions
 * 
 * @author venka
 */
public class CheapoairFlightsPage {
	
	/**
	 * 
	 * All WebElements are identified by @FindBy annotation
	 * 
	 */
	WebDriver driver;

	@FindBy(linkText = "Flights")
	WebElement flights;

	@FindBy(id = "rtFlight1")
	WebElement roundTrip;
	
	@FindBy(id = "owFlight")
	WebElement oneWay;
	
	@FindBy(id = "mcFlight")
	WebElement multiCities;
	
	@FindBy(id = "ember748")
	WebElement from;
	
	@FindBy(id = "ember753")
	WebElement to;
	
	public void CheapoairHomePage(WebDriver driver) {

		this.driver = driver;

		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);

	}

	// Set user name in textbox

}
