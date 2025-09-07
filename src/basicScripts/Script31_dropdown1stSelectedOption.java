package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script31_dropdown1stSelectedOption 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/r.php?entry_point=login");
		WebElement dropDown = driver.findElement(By.id("month"));
		Select s=new Select(dropDown);
		List<WebElement>  options=s.getOptions();
		for(WebElement ele:options)
		{
			System.out.println(ele.getText());
		}
	
	}
}
