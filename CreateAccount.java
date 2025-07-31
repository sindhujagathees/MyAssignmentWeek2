package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.edge.EdgeDriver;
public class CreateAccount {

	public static void main(String[] args) {
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
		
		// Click on the Accounts link
		driver1.findElement(By.linkText("Accounts")).click();
		
		// // Click on the Create Account link
		driver1.findElement(By.linkText("Create Account")).click();
		
		// Enter account name
		driver1.findElement(By.id("accountName")).sendKeys("Sindhujaga");
		
		// Enter the description
		driver1.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		// Find the dropdown element
		WebElement element = driver1.findElement(By.name("industryEnumId"));
		Select dropdown = new Select(element);
		dropdown.selectByIndex(3);
		WebElement ownershipEnumId = driver1.findElement(By.name("ownershipEnumId"));
		Select dropdown1 = new Select(ownershipEnumId);
		dropdown1.selectByVisibleText("S-Corporation");
		WebElement dataSourceId = driver1.findElement(By.name("dataSourceId"));
		Select dropdown2 = new Select(dataSourceId);
		dropdown2.selectByValue("LEAD_EMPLOYEE");
		WebElement marketingCampaignId = driver1.findElement(By.name("marketingCampaignId"));
		Select dropdown3 = new Select(marketingCampaignId);
		dropdown3.selectByIndex(6);
		WebElement generalStateProvinceGeoId = driver1.findElement(By.name("generalStateProvinceGeoId"));
		Select dropdown4 = new Select(generalStateProvinceGeoId);
		dropdown4.selectByValue("TX");
		
		// Click on the submit button
		driver1.findElement(By.linkText("submit")).click();
        driver1.close();

	}

}
