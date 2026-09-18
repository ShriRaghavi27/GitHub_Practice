

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1_Navigation {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println("www.google.com");
	driver.get("https://www.google.com/");
	driver.navigate().to("https://www.amazon.in/");
	
	driver.navigate().back();
	driver.navigate().forward();
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Clothes",Keys.ENTER);
	
	driver.quit();
	
	}

}
