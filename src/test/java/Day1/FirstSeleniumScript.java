package Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		// Open URL
		driver.get("https://practicetestautomation.com/practice-test-login/");
		// Validate title of the page
		String act_title = driver.getTitle();
				
		if (act_title.equals("Test Login | Practice Test Automation")) {

			System.out.println("Testcase is passed");
		} else {

			System.out.println("Test case is Failed");
		}
		// Closing the browser
		driver.quit();
	}

}
