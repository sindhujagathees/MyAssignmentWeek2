package week3.day2;

// Chrome class inherits Browser class
public class Chrome extends Browser {
	
	// Method to open chrome in incognito mode
	public void openIncognito()
	{
		System.out.println("opened in incognito mode");
	}
		// Method to open in clear the cache
		public void clearCache()
		{
			System.out.println("Cache cleared");
		}
		public static void main(String[] args)
		{
			
			// Creating object for chrome class
			Chrome chromeBrowser = new Chrome();
			
			// Defining the variables
			chromeBrowser.browserName="Chrome";
			chromeBrowser.browserVersion="140.0.66";
			
			// Printing the variables
			System.out.println("Browsername:"+chromeBrowser.browserName);
			System.out.println("Browserversion:"+chromeBrowser.browserVersion);
			
			// Calling chrome and browser class methods
			chromeBrowser.openURL();
			chromeBrowser.navigateBack();
			chromeBrowser.openIncognito();
			chromeBrowser.clearCache();
			chromeBrowser.closeBrowser();
	}

}
