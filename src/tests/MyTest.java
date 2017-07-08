package tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pageObjects.MainPage;
import util.FactoryWebDriver;

public class MyTest {

	private MainPage page;

	@Before
	public void setUp() throws Exception {
		this.page = new MainPage(FactoryWebDriver.getWebDriver());
		System.out.println(this.page == null);
		this.page.open("/");
	}

	@After
	public void tearDown() throws Exception {
		this.page.close();
	}

	@Test
	public void firstTest() {
		String title = "Selenium - Web Browser Automation";
		assertTrue(title.equals(this.page.getWebDriver().getTitle()));

	}

}
