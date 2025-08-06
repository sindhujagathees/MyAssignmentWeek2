package week3.day2;

public class BasePage {
	public void findElement()
	{
		System.out.println("The element is found");
	}
	public void clickElement()
	{
		System.out.println("The element is clicked");
	}
	public void enterText()
	{
		System.out.println("The text is entered");
	}
	public void performCommonTask()
	{
		System.out.println("performed the common task");
	}

	public static void main(String[] args) {
		
		BasePage options=new BasePage();
		options.clickElement();
		options.findElement();
		options.enterText();
		options.performCommonTask();
		
	}

}
