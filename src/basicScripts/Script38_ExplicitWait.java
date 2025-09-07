package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script38_ExplicitWait 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/progress?sublist=0");
		WebDriverWait ew=new WebDriverWait(driver, 10);
		
		//condition1
		ew.until(ExpectedConditions.titleContains("Synchronization"));
		String title = driver.getTitle();
		System.out.println(title);
		
		//condition2
		ew.until(ExpectedConditions.urlContains("progress"));
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
	}
}
