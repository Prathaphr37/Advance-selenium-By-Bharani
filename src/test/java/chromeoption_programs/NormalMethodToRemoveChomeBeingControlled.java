package chromeoption_programs;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NormalMethodToRemoveChomeBeingControlled {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		
		ArrayList eSwitches = new ArrayList<>();
		eSwitches.add("enable-automation");
		options.setExperimentalOption("excludeSwitches",eSwitches );
		options.setExperimentalOption("useAutomationExtension", false);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
	}
}
