package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script16 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Compaq/Desktop/PractisePage.html");
		Thread.sleep(2000);
		WebElement checkbox=driver.findElement(By.xpath("//input[@type='Checkbox']"));
		if(checkbox.isDisplayed())
		{
			System.out.println("The element is displayed");
			if(checkbox.isEnabled())
			{
				System.out.println("The element is Enabled");
				if(checkbox.isSelected())
				{
					System.out.println("The element is selected");
				}
				else
				{
					System.out.println("The element is not selected");
				}
			}
			else
			{
				System.out.println("The element is disabled");
			}
		}
		else
		{
			System.out.println("The element is not displayed");
		}
		driver.quit();
	}
}
