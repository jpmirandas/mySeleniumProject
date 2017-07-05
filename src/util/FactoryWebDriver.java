package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FactoryWebDriver {

	private static WebDriver webdriver;

	public static WebDriver getWebDriver() {

		String browserUT = PropertyReader.getProperty("browser.name");
		
		if (webdriver == null) {
			
			switch (browserUT) {
			case "safari":
				webdriver = new SafariDriver();
				return webdriver;
			case "firefox":
				webdriver = new FirefoxDriver();
				return webdriver;
				default:
				break;
			}
		}
		
		return webdriver;
	}
}
