package chromeoption_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//IncognitoMode program
public class IncognitoMode {

	
	@Test
	public void amazon() {
		
		ChromeOptions options = new ChromeOptions();
		
		//incognito mode
		options.addArguments("incognito");
//		options.addArguments("--incognito");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		System.out.println("browser opened in incognito mode");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}
}
