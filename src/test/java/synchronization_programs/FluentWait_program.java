package synchronization_programs;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait_program {

	@Test
	public void amazon() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		Fluent wait
		FluentWait wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(250))
				.ignoring(NoSuchElementException.class);
		
		driver.get("https://www.amazon.in");
		wait.until(ExpectedConditions.titleContains("shopping"));
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}
