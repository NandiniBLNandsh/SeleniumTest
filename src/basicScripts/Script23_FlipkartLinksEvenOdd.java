package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script23_FlipkartLinksEvenOdd 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.flipkart.com/");
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	int count=links.size();
	Thread.sleep(2000);
	for(int i=count-1;i>=0;i--)
	{
		WebElement link=links.get(i);
		String url=link.getAttribute("href");
		String text=link.getText();
		System.out.println(i+" "+url+" "+text);
		
	}
	driver.quit();
	}
}
