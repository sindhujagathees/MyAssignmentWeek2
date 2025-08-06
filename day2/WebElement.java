package week3.day2;

public class WebElement {
	public void Click()
	{
		System.out.println("Webelement clicked");
		
	}
  public void SetText(String Text) {
	  System.out.println("The string text is set");
  }
	public static void main(String[] args) {
		WebElement options = new WebElement();
		options.Click();
		options.SetText(null);
	}

}
