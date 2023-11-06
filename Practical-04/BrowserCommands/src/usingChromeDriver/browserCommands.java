package usingChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserCommands {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Study Materials\\Academics\\MCA\\MCA SEM III\\# Repos\\MCA-Software-Testing-and-Quality-Assurance-Lab\\Required Tools & Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
