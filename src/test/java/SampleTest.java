import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

		private WebDriver driver;
		
		@Before
		public void setUp() {
			System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
			driver = new ChromeDriver();
		}
		
		@After
		public void destroy() {
			driver.quit();
		}
		
		@Test
		public void loadYoutube() {
			driver.navigate().to("https://www.youtube.com");
			String title = driver.getTitle();
			assertTrue(title.contains("youtube"));
		}
}
