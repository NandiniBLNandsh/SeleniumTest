package basicScripts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script45_ChildBrowserPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[.='Shop Now']")).click();
		String parentTab=driver.getWindowHandle();
		System.out.println(parentTab);
		Set<String> childTabs = driver.getWindowHandles();
		for(String tab:childTabs)
		{
			WebDriver iTab = driver.switchTo().window(tab);
			System.out.println(iTab.getTitle());
			Thread.sleep(2000);
			if(!tab.equals(parentTab))
			{
				iTab.close();
			}
		}
	}
}
