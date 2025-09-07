package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script30_DropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Compaq/Desktop/Dropdown.html");
		WebElement dropDown = driver.findElement(By.id("skills"));
		Select s=new Select(dropDown);
		if(s.isMultiple())
		{
			System.out.println("It is a multiselect dropdown");
			s.selectByIndex(3);
			s.selectByValue("i");
			s.selectByVisibleText("TESTNG");
			Thread.sleep(2000);
			//s.deselectAll();
			s.deselectByIndex(0);
			s.deselectByValue("k");
			s.deselectByVisibleText("TESTNG");
			driver.quit();
		}
		else
		{
			System.out.println("It is a not multiselect dropdown");
		}
	}
}
