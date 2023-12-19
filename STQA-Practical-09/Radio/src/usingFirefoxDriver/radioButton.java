package usingFirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.support.ui.Select;

public class radioButton {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\Study Materials\\Academics\\MCA\\MCA SEM III\\# Repos\\MCA-Software-Testing-and-Quality-Assurance-Lab\\Required Tools & Software\\geckodriver.exe"); 
		WebDriver wd = new FirefoxDriver();

		wd.get("file:///F:/STQAWORKSPACE/stqa/src/pracs/Multi.html");

		Select s = new Select(wd.findElement(By.id("car"))); 
		if(s.isMultiple())
		{
			s.selectByIndex(1); s.selectByValue("3"); s.selectByVisibleText("Ferrari");

			Thread.sleep(2000);
			//s.deselectByIndex(1); 
			s.deselectAll();
		}
	}

}
