package chromeoption_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//Headless Browser With IncognitoMode
public class HeadlessBrowserWithIncognitoMode {

	
	@Test
	public void amazon() {
		
		ChromeOptions options = new ChromeOptions();
		
		//headless browser
		options.addArguments("headless");
		
		//incognito mode
		options.addArguments("incognito");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		System.out.println("headless browser is launched in backend in incognito mode");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		
		System.out.println("browser closed");
	}
}
