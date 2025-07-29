package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class FaceBookRegistration {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		ChromeDriver driver1 = new ChromeDriver(options);
		driver1.get("https://en-gb.facebook.com/");
		driver1.manage().window().maximize();
		//driver1.findElement(By.id("username")).sendKeys("DemoCSR");

		//driver1.findElement(By.id("password")).sendKeys("crmsfa");
		driver1.findElement(By.linkText("Create new account")).click();
		driver1.findElement(By.id("createnewaccount_firstName")).sendKeys("Sindhuja");

		
		driver1.findElement(By.id("createnewaccount_lastName")).sendKeys("Jagatheesan");
		WebElement sourceElement = driver1.findElement(By.id("createnewaccount_dataSourceId"));
		Select dropdown = new Select(sourceElement);
		dropdown.selectByValue("Day");
		dropdown.selectByValue("Month");
		dropdown.selectByValue("Year");
		WebElement sourceElement1 = driver1.findElement(By.id("//input[@value='male']"));
		Select radio1=new Select(sourceElement1);
		radio1.selectByValue("male");
		radio1.selectByValue("female");
		radio1.selectByValue("custom");
		
        driver1.findElement(By.name("SignUP")).click();
	}

}
