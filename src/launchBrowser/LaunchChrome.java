package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subha\\June2021_Selenium\\1st-Selenium-Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new ChromeDriver();//here driver is object variable.
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q")).sendKeys("selenium");
		//driver.findElement(By.name("btnk")).click();
		driver.manage().window().maximize();
		//wait
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		driver.close();
	}
	

}
