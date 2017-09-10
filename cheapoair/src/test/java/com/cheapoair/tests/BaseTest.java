package com.cheapoair.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

	WebDriver m_driver = null;

	enum Driver {
		CHROME, FF, IE;
	}

	@Parameters({ "browser", "url" })
	@BeforeTest
	public void setup(String browser, String url) {

		System.out.println("Enter BeforeTest()");

		initializeDriver(browser);
		m_driver.get(url);
		m_driver.manage().window().maximize();
	}

	private void initializeDriver(String browser) {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		switch (Driver.valueOf(browser.toUpperCase())) {
		case CHROME:

			capabilities = DesiredCapabilities.chrome();
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver.exe");
			m_driver = new ChromeDriver(capabilities);
			
			
			break;
		case FF:

			break;

		case IE:

			break;
		default:
			break;
		}

	}

	@AfterMethod
	public void tearDown() {

		m_driver.quit();
	}

}
