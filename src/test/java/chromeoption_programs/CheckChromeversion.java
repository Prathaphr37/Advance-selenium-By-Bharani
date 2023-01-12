package chromeoption_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//program for Check Chrome version
public class CheckChromeversion {

	@Test
	public void amazon() {
		
		ChromeOptions options = new ChromeOptions();
		
		//version check
		ChromeOptions vers = options.addArguments("--version");
		System.out.println(vers);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}
}
