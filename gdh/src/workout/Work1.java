package workout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Work1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\\\Automation\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

	}

}
