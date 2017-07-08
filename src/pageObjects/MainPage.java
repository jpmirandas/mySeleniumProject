package pageObjects;

import org.openqa.selenium.By;

public class MainPage extends BasePage {

	// locators
	By button_go = By.cssSelector("#submit");
	By field_search = By.cssSelector("#q");

	public MainPage() {
		super();
	}

	public GoogleSearchPage performSearch(String key) {
		getWebDriver().findElement(field_search).clear();
		getWebDriver().findElement(field_search).sendKeys(key);
		getWebDriver().findElement(button_go).click();
		return new GoogleSearchPage();
	}

}
