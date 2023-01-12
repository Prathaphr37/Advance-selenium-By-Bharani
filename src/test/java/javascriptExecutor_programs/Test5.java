package javascriptExecutor_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//program to handle the disable element 
public class Test5 {

	@Test
	public void demo() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Prathap/OneDrive/Desktop/disabled.html");
		WebElement ele = driver.findElement(By.id("abc"));
		if (ele.isEnabled()) {
			System.out.println("Pass:  element is enabled");
		} else {
			System.out.println("Fail:  element is not enabled");
		}
		
		
		// type casting to javascript executor 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//write to disabled textbox
		js.executeScript("document.getElementById('abc').value='prathap'");
		Thread.sleep(3000);
		//clear the text from disabled textbox
		js.executeScript("document.getElementById('abc').value=''");
		Thread.sleep(3000);
		driver.close();
		
	}
}
