package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class SeleniumTester {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
	
		ChromeDriver driver1 = new ChromeDriver(options);
		
		driver1.get("http://leaftaps.com/opentaps/control/main");

		driver1.manage().window().maximize();

		driver1.findElement(By.id("username")).sendKeys("DemoCSR");

		driver1.findElement(By.id("password")).sendKeys("crmsfa");

		driver1.findElement(By.className("decorativeSubmit")).click();

		driver1.findElement(By.partialLinkText("CRM")).click();

		driver1.findElement(By.linkText("Leads")).click();

		driver1.findElement(By.linkText("Create Lead")).click();

		driver1.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		driver1.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");

		driver1.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");

		WebElement sourceElement = driver1.findElement(By.id("createLeadForm_dataSourceId"));

		Select dropdown = new Select(sourceElement);

		dropdown.selectByValue("LEAD_DIRECTMAIL");

		driver1.findElement(By.name("submitButton")).click();
	}


	}


