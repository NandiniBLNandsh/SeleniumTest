package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script29_DragAndDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		Actions act=new Actions(driver);
		Thread.sleep(10000);
		WebElement MobileCharger = driver.findElement(By.xpath("//div[.='Mobile Charger']"));
		WebElement MobileCover = driver.findElement(By.xpath("//div[.='Mobile Cover']"));
		WebElement MobileAccessories = driver.findElement(By.xpath("//div[.='Mobile Accessories']"));	
		Thread.sleep(2000);
		act.dragAndDrop(MobileCharger, MobileAccessories).perform();
		act.dragAndDrop(MobileCover, MobileAccessories).perform();
	}
}
