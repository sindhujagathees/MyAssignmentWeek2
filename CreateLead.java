package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class CreateLead {

	public static void main(String[] args) {
		
		//To launch in a guest mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		// Launch the browser
		ChromeDriver driver1 = new ChromeDriver(options);
		
		// Load the url - get
		driver1.get("http://leaftaps.com/opentaps/control/main");
		
		// Maximize the browser
		driver1.manage().window().maximize();
		
		// Enter the username
		driver1.findElement(By.id("username")).sendKeys("DemoCSR");

		// Enter the password
		driver1.findElement(By.id("password")).sendKeys("crmsfa");

		// Click the Login button
		driver1.findElement(By.className("decorativeSubmit")).click();
		
		// Clcik on the CRMSFA link
		driver1.findElement(By.partialLinkText("CRM")).click();
		
		// Click on the Leads link
		driver1.findElement(By.linkText("Leads")).click();
		
		// Click on the Create Lead link
		driver1.findElement(By.linkText("Create Lead")).click();
		
		// Enter company name
		driver1.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		// Enter first name
		driver1.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
		
		// Enter the last name
		driver1.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
		
		// Step1: Find the dropdown element
		WebElement sourceElement = driver1.findElement(By.id("createLeadForm_dataSourceId"));
		
		// Step2: Select-Create an Object
		Select dropdown = new Select(sourceElement);

		dropdown.selectByValue("LEAD_DIRECTMAIL");

		// Click on the Create lead button
		driver1.findElement(By.name("submitButton")).click();
	}

	}


