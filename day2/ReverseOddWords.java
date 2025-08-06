package week3.day2;

public class ReverseOddWords {

	public static void main(String[] args) {
		// Input string
        String test = "I am a software tester";

        // Split the string into words
        String[] words = test.split(" ");

        // Output string to build final result
        String output = "";

        // Loop through each word
        for (int i = 0; i < words.length; i++) {
            // Check for odd index (0-based index)
            if (i % 2 != 0) {
                // Convert word to character array and reverse it
                char[] charArray = words[i].toCharArray();
                for (int j = charArray.length - 1; j >= 0; j--) {
                    output += charArray[j];
                }
            } else {
                // Keep the even index word as it is
                output += words[i];
            }

            // Add space after each word
            output += " ";
        }

        // Trim and print the final output
        System.out.println("Output: " + output.trim());
	}

}
