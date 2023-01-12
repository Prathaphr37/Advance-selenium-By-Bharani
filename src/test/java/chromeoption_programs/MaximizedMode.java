package chromeoption_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
// program for maximized mode
public class MaximizedMode {

	@Test
	public void amazon() {
		
		ChromeOptions options = new ChromeOptions();
		
		//maximized mode
		options.addArguments("start-maximized");
//		options.addArguments("--start-maximized");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in");
		
		System.out.println("browser opened in maximized mode");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}
}
