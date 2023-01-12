package javascriptExecutor_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//program for scroll to particular loacation and click using window.scrollBy("+x+","+y+") using location ie., co ordinates and click without click() method
public class Test3 {

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
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();",ele);
		Thread.sleep(5000);
		driver.close();
		
	}
}
