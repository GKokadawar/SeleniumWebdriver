package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// Open URL
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		//name 
		driver.findElement(By.name("username")).sendKeys("girish");
		//driver.quit();
		//id 
		driver.findElement(By.id("password")).sendKeys("Test@123");
		//link text
		driver.findElement(By.linkText("Udemy Courses")).click();
		//partialLink Text
		driver.findElement(By.partialLinkText("y Courses")).click();
		//classname
		List<WebElement> headerlinks = driver.findElements(By.className("widget-content"));
		System.out.println(headerlinks.size());
		//tagname
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		
		
		

	}

}
