package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		// Open URL
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement uname = driver.findElement(By.name("username"));
		uname.sendKeys("student");
		WebElement upwd = driver.findElement(By.name("password"));
		upwd.sendKeys("Password123");
		WebElement button = driver.findElement(By.id("submit"));
		button.click();
		String act_title = driver.getTitle();

		if (act_title.equals("Logged In Successfully | Practice Test Automation")) {

			System.out.println("Testcase is passed");
		} else {

			System.out.println("Test case is Failed");
		}
		driver.quit();

	}

}
