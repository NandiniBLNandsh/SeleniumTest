package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script28_ClickAndHoldAndRelease 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/clickHold");
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		WebElement Element = driver.findElement(By.id("circle"));
		Thread.sleep(2000);
		act.clickAndHold(Element).perform();
		Thread.sleep(1000);
		act.release(Element).perform();
	}
}
