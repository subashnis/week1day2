package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Pseudo Code		 
		 * Declare String Input as Follow		  
		 * String test = "changeme";		 
		 * a) Convert the String to character array		 
		 * b) Traverse through each character (using loop)		 
		 * c)find the odd index within the loop (use mod operator)		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change		  
		 */
		
		String str = "changeme";	
		//String upperCase = str.toUpperCase();
		char[] charArray = str.toCharArray();		
		int length = charArray.length;
		
		for (int i = 0; i < charArray.length; i++) {			
			if (i%2 != 0) {	//c h a n g e m e			
				charArray[i] = Character.toUpperCase(charArray[i]);					
			} 			
		}
		for (int i = 0; i < charArray.length; i++)  {
			System.out.print(charArray[i]);
		}
		
	}

}
