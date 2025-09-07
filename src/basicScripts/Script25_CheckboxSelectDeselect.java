package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script25_CheckboxSelectDeselect 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Compaq/Desktop/checkbox.html");
		List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count=checkboxs.size();
		for(WebElement checkbox : checkboxs)
		{
			checkbox.click();
		}
		for(int i=count-1;i>=0;i--)
		{
			WebElement checkbox=checkboxs.get(i);
			checkbox.click();
		}
		
	}
}
