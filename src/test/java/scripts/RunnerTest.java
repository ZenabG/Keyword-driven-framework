package scripts;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import keywords.ExecuteKeywordsTest;

public class RunnerTest {
	static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}
	
	@Test
	public void testThis() throws Exception {
		ExecuteKeywordsTest exec = new ExecuteKeywordsTest();
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		exec.keyword_executor();
	}
}