package week3.day2;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// Input string
		String text = "We learn Java basics as part of java sessions in java week1";
		
		// Intialize duplicate count
		int count = 0;
		
		// Split the text into word
		String[] str = text.split(" ");
		// Define a String variable modified by initializing it as empty String
		String modified = "";

		// Loop to find and remove duplicate words
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				
				// Compare the words and take the duplicates
				// count is incremented by 1
				if (str[i].equalsIgnoreCase(str[j])) {

					str[j] = " ";
					count = count + 1;
				} else
					continue;

			}
		}
		// If count is greater than 1 print the modified words
		if (count > 1) {
			for (int k = 0; k < str.length; k++) {
				modified = modified + " " + str[k];
			}
			System.out.println("Modified String is: " + modified);
		} else
			// if condition is false print the given text
			System.out.println(text);


	}

}
