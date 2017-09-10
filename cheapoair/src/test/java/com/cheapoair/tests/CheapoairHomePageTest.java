package com.cheapoair.tests;

import org.testng.annotations.Test;

import com.cheapoair.pageobjects.CheapoairHomePage;

public class CheapoairHomePageTest extends BaseTest {

	CheapoairHomePage homePage = null;

	@Test
	public void homePageTest() {

		System.out.println("Enter HomePageTest()");

		homePage = new CheapoairHomePage(m_driver);

		homePage.closePopup();

		homePage.clickFlights();
		homePage.clickHotels();
		homePage.clickCars();
		homePage.clickCrusises();
		homePage.clickVacations();

	}

}
