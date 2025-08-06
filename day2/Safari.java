package week3.day2;

public class Safari extends Browser{
	
	// Method to open safari in readermode
	public void readerMode()
	{
		System.out.println("In readermode");
	}
	
	// Method to open safari in fullscreen mode
	public void fullScreenMode()
	{
		System.out.println("In fullscreenmode ");
	}
	public static void main(String[] args)
	{
		
		// Creating object for safari class
		Safari safariBrowser=new Safari();
		
		// Defining super class variables
		safariBrowser.browserName="Safari";
		safariBrowser.browserVersion="20.0";
	// Printing the variables
		System.out.println("Browser name: "+safariBrowser.browserName);
		System.out.println("Browser version: "+safariBrowser.browserVersion);
		
		// Calling both safari class and browser class methods
		safariBrowser.openURL();
		safariBrowser.navigateBack();
		safariBrowser.readerMode();
		safariBrowser.fullScreenMode();
		safariBrowser.closeBrowser();
	}
	

}
