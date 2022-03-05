import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumIntro {

	public static void main(String[] args) {
		//Invoking browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARNAB MODAK\\Documents\\chromedriver\\chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARNAB MODAK\\Documents\\geckoDriver\\geckodriver.exe");
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ARNAB MODAK\\Documents\\edgeDriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://google.com");
		System.out.println("Title: "+driver.getTitle());
		System.out.println("Current URL: "+driver.getCurrentUrl());
		driver.close(); // driver.quit() will close all associated tabs 

	}

}
