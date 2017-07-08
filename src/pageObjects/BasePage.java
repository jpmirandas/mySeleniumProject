package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import util.PropertyReader;

public class BasePage {
	private WebDriver webdriver;
	
	protected BasePage(WebDriver webdriver){
		this.webdriver = webdriver;
	}
	
	public WebDriver getWebDriver(){
		return this.webdriver;
	}
	
	public void waitForPageLoad(){
		JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
		js.executeScript("return jQuery.active == 0");
	}
	
	public void close(){
		this.webdriver.close();
	}
	
	public void open(String page) {
		String baseUrl = PropertyReader.getProperty("base.url");
		getWebDriver().get(baseUrl + page);
		waitForPageLoad();
	}
}
