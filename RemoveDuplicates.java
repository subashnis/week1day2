package week1.day2;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Pseudo code 		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 		 
		 * g) Displaying the String without duplicate words	
		 */
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] strArray = text.split(" ");
		int count = 0;
		
		for (int i = 0; i < strArray.length-1; i++) {
			for (int j = i+1; j < strArray.length-1; j++) {
				if (strArray[i].equalsIgnoreCase(strArray[j])) {
					//count = count + 1;
					strArray[j] = "";
				}
			}
		}		//done ji
		/* for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		*/		
		System.out.println(Arrays.toString(strArray));
	}
}