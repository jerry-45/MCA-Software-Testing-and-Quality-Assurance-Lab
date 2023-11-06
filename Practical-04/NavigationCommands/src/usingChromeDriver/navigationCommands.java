package usingChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationCommands {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Study Materials\\Academics\\MCA\\MCA SEM III\\# Repos\\MCA-Software-Testing-and-Quality-Assurance-Lab\\Required Tools & Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// List of Navigation Commands
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.navigate().to("https://artoftesting.com/");	// 1
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.navigate().back();	// 2
		String str1 = driver.getCurrentUrl();
		System.out.println(str1);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.navigate().forward();	// 3
		String str2 = driver.getCurrentUrl();
		System.out.println(str2);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.navigate().refresh();	// 4
		String str3 = driver.getCurrentUrl();
		System.out.println(str3);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.quit();
	}
}
