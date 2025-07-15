package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// Open URL
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		// tag id tag#id tag is optional but#need to be add
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Gk");
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("mobiles");

		// tag class tag.classname
		driver.findElement(By.cssSelector("button.button-1 ")).click();
		// tag attributes tag[attribute='value']
		driver.findElement(By.cssSelector("input.search-box-text[placeholder=\"Search store\"]")).sendKeys("Nokia");

		// tag class attribute
		driver.findElement(By.cssSelector("input.search-box-text[placeholder=\"Search store\"]")).sendKeys("Iphones");
	}

}
