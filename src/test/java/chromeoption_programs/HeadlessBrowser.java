package chromeoption_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//headless browser
public class HeadlessBrowser {

	@Test
	public void amazon() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
//		options.addArguments("--headless");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		System.out.println("headless browser is launched in backend");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		
		System.out.println("browser closed");
	}
	
}
