package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.id("username"));
	}	
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='password']"));
	}
	public static WebElement loginbutton(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='submit']"));
	}

}

