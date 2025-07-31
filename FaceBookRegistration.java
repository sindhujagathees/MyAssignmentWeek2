package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class FaceBookRegistration {

	public static void main(String[] args) {
		
		//To launch in a guest mode
		ChromeOptions options = new ChromeOptions();
		
		// Launch the browser
		ChromeDriver driver1 = new ChromeDriver(options);
		
		// Load the url - get
		driver1.get("https://en-gb.facebook.com/");
		
		// Maximize the browser
		driver1.manage().window().maximize();
		
		// Click on create new account
		driver1.findElement(By.linkText("Create new account")).click();
		
		// Enter the firstname
		driver1.findElement(By.name("firstname")).sendKeys("Sindhuja");
		
		// Enter the lastname
		driver1.findElement(By.name("lastname")).sendKeys("Jagatheesan");
		
		// Find the dropdown element
		WebElement sourceElement = driver1.findElement(By.id("day"));
		
		// Step2: Select-Create an Object
		Select click=new Select(sourceElement);
		
		// select by index
		click.selectByIndex(1);
		WebElement sourceElement1 = driver1.findElement(By.id("month"));
		Select click1=new Select(sourceElement1);
		click1.selectByIndex(2);
		WebElement sourceElement2 = driver1.findElement(By.id("year"));
		Select click2=new Select(sourceElement2);
		click2.selectByValue("1981");
		
		// Enter the email address
		driver1.findElement(By.name("reg_email__")).sendKeys("sinja2011@gmail.com");
		
		// Enter the password
		driver1.findElement(By.name("reg_passwd__")).sendKeys("******");
		
		// Find the element by gender and value
		driver1.findElement(By.xpath("//input[@name='sex' and @value='1']")).click();
		
		// Click on the signup button
        driver1.findElement(By.name("websubmit")).click();
       // driver1.close();
	}

}
