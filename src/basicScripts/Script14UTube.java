package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script14UTube 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("muddu rakshasi kannada song");
		driver.findElement(By.cssSelector("button[class='ytSearchboxComponentSearchButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("yt-formatted-string[aria-label='Muddu Raakshasi Video Song | Vaamana | Chethan Gowda | Dhanveerah, Reeshma Nanaiah |Shankar 3 minutes, 39 seconds']")).click();
	}

}
