package week3.day2;

public class Browser {

	public  void openURL() {
	// Method to open URL	
	System.out.println("URL opened");
	}
	// Method to close the browser
	public void closeBrowser()
	{
		System.out.println("Browser closed");
	}
	// Method to navigate back
    public void navigateBack()
{
	System.out.println("navigated back");
}
    //Declaring global variables
    public String browserName;
    public String browserVersion;
    public static void main(String[] args) {
    	// Creating object for the browser class
    	Browser browser=new Browser();
    	
    	// Defining the variables
    	browser.browserName= "Browser";
    	browser.browserVersion= "2.0";
    	
    	// Printing the variables
    	System.out.println("Browser Name:" +browser.browserName);
    	System.out.println("Browser Version:" +browser.browserVersion);
    	
    	//Calling the methods
    	browser.openURL();
    	browser.navigateBack();
    	browser.closeBrowser();
    }
}
