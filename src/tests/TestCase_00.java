package tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pageObjects.GoogleSearchPage;
import pageObjects.MainPage;

public class TestCase_00 {

	private MainPage mainPage;

	@Before
	public void setUp() throws Exception {
		this.mainPage = new MainPage();
		this.mainPage.open("/");
	}

	@After
	public void tearDown() throws Exception {
		this.mainPage.close();
	}

	@Test
	public void test_00() {
		GoogleSearchPage searchPage = this.mainPage.performSearch("aew");
		assertTrue("Wront title!", "Google Custom Search".equals(searchPage.getTitle()));

	}

}
