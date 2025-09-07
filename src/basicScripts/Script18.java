package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script18 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Compaq/Desktop/PractisePage.html");
		WebElement link = driver.findElement(By.tagName("a"));
		Dimension size=link.getSize();
		System.out.println(size);
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		String elementText=link.getText();
		System.out.println(elementText);
		String av=link.getAttribute("href");
		System.out.println(av);
		WebElement CheckBox=driver.findElement(By.xpath("//input[@type='Checkbox']"));
		String tagName=CheckBox.getTagName();
		System.out.println(tagName);
		Point location=CheckBox.getLocation();
		System.out.println(location);
		System.out.println(location.getX());
		System.out.println(location.getY());
		String av1=CheckBox.getAttribute("type");
		System.out.println(av1);
		driver.quit();
	}
}
