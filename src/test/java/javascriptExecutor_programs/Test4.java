package javascriptExecutor_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//program for refresh title URL
public class Test4 {

	@Test
	public void demo() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		WebElement ele = driver.findElement(By.xpath("//div[@class='navFooterLine navFooterLogoLine']"));
		
		// type casting to javascript executor 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// refresh the page
		js.executeScript("history.go(0)");
		
		// retrieve the title of the page
		System.out.println(js.executeScript("return document.title"));
		
		// retrieve the url of the page
		System.out.println(js.executeScript("return document.URL"));
		
		Thread.sleep(5000);
		driver.close();
		
	}
}
