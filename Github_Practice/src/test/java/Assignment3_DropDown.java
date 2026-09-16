
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3_DropDown {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.amazon.in/");
		WebElement element = driver.findElement(By.xpath("//select[contains(@class,'nav-search-dropdown')]"));
		element.click();
		//dropDown(element,"Beauty");
		
		//driver.quit();
		}
	public static void dropDown(WebElement element,String value)
	{
		Select sc=new Select(element);
		System.out.println(sc.isMultiple());
		List<WebElement> list = sc.getOptions();
		System.out.println(list.size());
		for(WebElement i:list)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
		}
	}
}