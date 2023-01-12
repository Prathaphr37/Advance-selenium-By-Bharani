package synchronization_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait_program {
	@Test
	public void amazon() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		
//		custom wait
		while (true) {
			try {
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				break;
			} catch (Exception e) {
				System.out.println("element not found");
			}
			driver.close();
		}
	}
}
