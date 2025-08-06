package week3.day2;

public class CheckBoxButton extends Button {
public void ClickCheckButton()
{
	System.out.println("Clicked the checkbox button");
}
	public static void main(String[] args) {
		CheckBoxButton options = new CheckBoxButton();
		options.Click();
		options.ClickCheckButton();
		options.SetText(null);
		options.Submit();
		

	}

}
