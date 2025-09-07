package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script22_FlipkartLinks 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count=links.size();
		for(int i=0; i<=count-1;i++)
		{
			WebElement link=links.get(i);
			String url=link.getAttribute("href");
			String text=link.getText();
			System.out.println(i+" "+url+" "+text);
			
		}
		driver.quit();
	}
}
