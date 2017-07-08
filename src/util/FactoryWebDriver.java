package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FactoryWebDriver {

	static WebDriver webdriver;
	final static String SAFARI = "safari";
	final static String FIREFOX = "firefox";
	final static String PHANTOMJS = "phantomjs";

	public static WebDriver getWebDriver() {

		String browserUT = PropertyReader.getProperty(PropertyOptions.BROWSER_NAME);

		if (webdriver == null) {

			switch (browserUT) {
			case SAFARI:
				webdriver = new SafariDriver();
				break;
			case FIREFOX:
				webdriver = new FirefoxDriver();
				break;
			case PHANTOMJS:
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
