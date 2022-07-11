package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		/* Pseudo Code:		 
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)		
		d)split the words and have it in an array		
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		*/
		
		String[] testArray = test.split(" ");		
		
		for (int i = 0; i < testArray.length; i++) {
			if (i%2 ==0 ) {
				System.out.print(testArray[i] + " ");
				 } else {
					 char[] strChar = testArray[i].toCharArray();
						for (int j = strChar.length-1; j >= 0 ; j--) 
						{
							// String revStr = ""+strChar[j];
							// System.out.print(revStr +  " ");
							System.out.print(strChar[j]);
						}
						System.out.print(" ");
				}  
			} 
			
		}
		
	}