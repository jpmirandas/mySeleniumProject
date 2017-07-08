package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FactoryWebDriver {

	static WebDriver webdriver;

	public static WebDriver getWebDriver() {

		String browserUT = PropertyReader.getProperty("browser.name");

		if (webdriver == null) {

			switch (browserUT) {
			case "safari":
				webdriver = new SafariDriver();
				break;
			case "firefox":
				webdriver = new FirefoxDriver();
				break;
			case "phantomjs":
				webdriver = new PhantomJSDriver();
				break;
			default:
				System.err.println("The choosen webdriver is not valide!");
				break;
			}
		}

		return webdriver;
	}
}
