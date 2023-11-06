package usingFirefoxDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Study Materials\\Academics\\MCA\\MCA SEM III\\# Repos\\MCA-Software-Testing-and-Quality-Assurance-Lab\\Required Tools & Software\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		// List of Browser Commands
		driver.get("https://www.facebook.com/");	// to go to particular page ex. www.javatpoint.com
		
		String Title = driver.getTitle();
		System.out.println("Webpage Title is " + Title);
		
		String CurrentURL = driver.getCurrentUrl();
		System.out.println("Webpage Current URL is " + CurrentURL);
		
		String PageSource = driver.getPageSource();
		System.out.println("Webpage Page Source is " + PageSource);
	}
}
