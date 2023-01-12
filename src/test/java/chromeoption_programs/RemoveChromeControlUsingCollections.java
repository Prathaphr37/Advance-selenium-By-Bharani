package chromeoption_programs;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

//program to remove chrome is being controlled by automated test software using Collections
public class RemoveChromeControlUsingCollections {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Collections.singleton( "enable-automation"));
//		options.setExperimentalOption("excludeSwitches", Collections.singletonList( "enable-automation"));
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
	}
}
