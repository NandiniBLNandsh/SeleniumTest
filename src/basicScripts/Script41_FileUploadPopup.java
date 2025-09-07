package basicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script41_FileUploadPopup 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement upload = driver.findElement(By.id("resume"));
		upload.sendKeys("C:\\Users\\Compaq\\eclipse-workspace\\SeleniumTest\\Excel\\qsp.xlsx");
	}
}
