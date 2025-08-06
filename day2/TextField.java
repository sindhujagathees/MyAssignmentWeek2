package week3.day2;

public class TextField extends WebElement {
	public void getText()
	{
		System.out.println("Textfield created");
	}

	public static void main(String[] args) {
		TextField textOptions = new TextField();
		textOptions.Click();
		textOptions.SetText(null);
		textOptions.getText();
	
		
		

	}

}
