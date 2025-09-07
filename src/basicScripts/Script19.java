package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script19 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement LoginButton = driver.findElement(By.name("Log in"));
		String BC = LoginButton.getCssValue("background-color");
		System.out.println(BC);
		String fontFamily = LoginButton.getCssValue("font-family");
		System.out.println(fontFamily);
		driver.quit();
	}
}
