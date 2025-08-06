package week3.day1;

public class ChangeOddindexToUpperCase {

	public static void main(String[] args) {
		
		// Declaring the input string
		        String test = "changeme";

		        // Converting string to character array
		        char[] charArray = test.toCharArray();

		        // 
		        for (int i = charArray.length - 1; i >= 0; i--) {
		        	
		        	// Check the letter which is odd
		            if (i % 2 != 0) {
		            	
		            	// Changing the odd letter to uppercase
		                charArray[i] = Character.toUpperCase(charArray[i]);
		            }
		        }

		        // Printing the new string
		        System.out.println( new String(charArray));
		    }
		

	}


