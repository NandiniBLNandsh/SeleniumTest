package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script36_QspiderDisabledEle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[.='Disabled']")).click();
		WebElement psw = driver.findElement(By.xpath("//input[@type='password']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		//js.executeScript("document.getElementById('name').value=''");
		//Thread.sleep(2000);
		js.executeScript("document.getElementById('name').value='Nandini'");
		js.executeScript("document.getElementById('email').value='bl.nandini90@gmail.com'");
		js.executeScript("arguments[0].value='Nandini123'", psw);
		//driver.quit();
	}
}
