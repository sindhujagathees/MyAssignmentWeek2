package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		
	
	// ==
		if (text1.length() == text2.length())
				{
			
			//Convert a String into Character Array
			char[] charArray = text1.toCharArray();
			char[] charArray1 = text2.toCharArray();
				
		// Sorting the two characters
		Arrays.sort(charArray);
		Arrays.sort(charArray1);
	
		//Check if the sorted arrays are equal
		if (Arrays.equals(charArray,charArray1))
	System.out.println("The given Strings are Anagram");
else
	System.out.println("The given Strings are not an Anagram");

	}
	else
		System.out.println("Lengths mismatch.Therefore the strings are not an Anagram");

}
	

}
	
		

	


