package week3.day2;

public class RadioButton  extends Button{
public void SelectRadioButton()
{
	System.out.println("Radio button selected");
}
	public static void main(String[] args) {
		RadioButton options = new RadioButton();
		options.SelectRadioButton();
		options.Click();
		options.SetText(null);
		options.Submit();
	
		

	}

}
