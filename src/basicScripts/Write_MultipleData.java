package basicScripts;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Write_MultipleData 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count =links.size();
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet=book.createSheet("links");
		for(int i=0;i<count;i++)
		{
			WebElement link=links.get(i);
			String url=link.getAttribute("href");
			XSSFRow row=sheet.createRow(i);
			XSSFCell cell=row.createCell(0);
			cell.setCellValue(url);
		}
		FileOutputStream fos=new FileOutputStream("./Excel/FlipkartLinks.xlsx");
		book.write(fos);
		book.close();
		fos.close();
		System.out.println("Data is written");		
	}
}
