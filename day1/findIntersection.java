package week3.day1;

public class findIntersection {

	public static void main(String[] args) {
		
		// Declaring two integer arrays
		int a[]={3,2,11,4,6,7};
		int b[]={1,2,8,4,9,7};
		
		// Declaring for loop
		for(int i=0;i<a.length;i++)
		{
			
		// Declaring a nested for loop
		for(int j=0;j<b.length;j++)
		{
			// check if the element in array1 is equal to the element in array2
			if(a[i] == b[j])
			{
				// If the condition is true print the value from array1
				System.out.println(a[i]);
				
			}else
				continue;
				}
			}
		}
	}
		
		


