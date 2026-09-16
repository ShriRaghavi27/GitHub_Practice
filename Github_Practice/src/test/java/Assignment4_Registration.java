

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4_Registration {
	WebDriver driver;
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		regForm();
		driver.close();
	}
	public static void regForm() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.xpath("//span[@class='caret']")).click();
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Shri");
		driver.findElement(By.name("lastname")).sendKeys("Raghavi");
		driver.findElement(By.name("email")).sendKeys("shri@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("123456987");
		
		driver.findElement(By.id("input-password")).sendKeys("shriraghavi123");
		driver.findElement(By.id("input-confirm")).sendKeys("shriraghavi123");
		
		WebElement validationRadio = driver.findElement(By.name("newsletter"));
		
		if(!(validationRadio.isSelected()))
		{
			validationRadio.click();
		}
		
		WebElement validationCheckbox = driver.findElement(By.name("agree"));
				
				if(validationCheckbox.isEnabled())
				{
					validationCheckbox.click();
				}
				
		driver.findElement(By.xpath("//input[@type='submit']")).click();		
		}
		

}
