package com.cheapoair.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This Class contains Home Page elements and its actions
 * 
 * @author venka
 */
public class CheapoairHomePage {

	/**
	 * 
	 * All WebElements are identified by @FindBy annotation
	 * 
	 */

	WebDriver driver;

	@FindBy(linkText = "Flights")
	WebElement flights;

	@FindBy(linkText = "Hotels")
	WebElement hotels;

	@FindBy(linkText = "Cars")
	WebElement cars;

	@FindBy(linkText = "Cruises")
	WebElement cruises;

	@FindBy(linkText = "Vacations")
	WebElement vacations;
	
	@FindBy(css = ".signupClose.icon")
	WebElement popup;

	public CheapoairHomePage(WebDriver driver) {

		this.driver = driver;

		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);

	}

	// Set user name in textbox

	public void clickFlights() {

		flights.click();

	}

	// Set password in password textbox

	public void clickHotels() {

		hotels.click();

	}

	// Click on login button

	public void clickCars() {

		cars.click();

	}

	public void clickCrusises() {

		cruises.click();

	}

	public void clickVacations() {

		vacations.click();

	}

	public void closePopup() {
		
		popup.click();
	}
}
