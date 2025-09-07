package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script35_DisabledElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Compaq/Desktop/PractisePage.html");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//input[@value='admin']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].value=''",element);
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='user@gmail.com'",element);
		driver.quit();
	}
}
