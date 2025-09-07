package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script17 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Compaq/Desktop/PractisePage.html");
		WebElement USN = driver.findElement(By.xpath("//input[@type='text'][1]"));
		WebElement PSW = driver.findElement(By.xpath("//input[@type='text'][2]"));
		WebElement CheckBox = driver.findElement(By.xpath("//input[@type='Checkbox']"));
		WebElement RadioButton = driver.findElement(By.xpath("//input[@type='radio']"));
		WebElement link = driver.findElement(By.tagName("a"));
		USN.clear();
		PSW.sendKeys("abcd");
		CheckBox.click();
		RadioButton.click();
		link.click();
	}
}
