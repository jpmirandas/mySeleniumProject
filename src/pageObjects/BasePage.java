package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import util.*;

public class BasePage {
	private WebDriver webdriver;

	protected BasePage() {
		this.webdriver = FactoryWebDriver.getWebDriver();
	}

	public WebDriver getWebDriver() {
		return this.webdriver;
	}

	public void waitForPageLoad() {
		JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
		js.executeScript("return jQuery.active == 0");
	}

	public void close() {
		this.webdriver.close();
	}

	public void open(String page) {
		String baseUrl = PropertyReader.getProperty(PropertyOptions.BASE_URL);
		getWebDriver().get(baseUrl + page);
		waitForPageLoad();
	}

	public String getTitle() {
		return getWebDriver().getTitle();
	}
}
