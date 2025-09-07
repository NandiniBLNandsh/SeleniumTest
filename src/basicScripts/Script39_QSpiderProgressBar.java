package basicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script39_QSpiderProgressBar 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/progress/element?sublist=2");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@value='']")).sendKeys("10");
		driver.findElement(By.xpath("//button[.='Start']")).click();
		WebDriverWait ew=new WebDriverWait(driver, 10);
		WebElement dropdown = driver.findElement(By.xpath("(//select)[2]"));
		ew.until(ExpectedConditions.visibilityOf(dropdown));
		Select s=new Select(dropdown);
		s.selectByIndex(1);
	}
}
