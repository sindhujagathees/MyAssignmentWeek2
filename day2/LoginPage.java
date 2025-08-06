package week3.day2;

public class LoginPage extends BasePage{
	public void performCommonTask()
	{
		super.performCommonTask();
		System.out.println("The common task is performed");
	}

	public static void main(String[] args) {
		LoginPage options=new LoginPage();
		options.performCommonTask();
	}

}
