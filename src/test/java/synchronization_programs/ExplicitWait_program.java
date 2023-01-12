package synchronization_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_program {

	@Test
	public void amazon() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.amazon.in");
		wait.until(ExpectedConditions.titleContains("shopping"));
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}
