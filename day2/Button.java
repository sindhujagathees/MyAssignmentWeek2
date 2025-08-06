package week3.day2;

public class Button  extends WebElement{
	public void Submit()
	{
		System.out.println("submit the button");
	}

	public static void main(String[] args) {
		Button buttonOptions = new Button();
		buttonOptions.Click();
		buttonOptions.SetText(null);
		buttonOptions.Submit();

	}

}
