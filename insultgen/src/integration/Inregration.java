//Ryan McGuire integration project
//this program is going to ask for input from the user and generate random words

package integration;

import java.util.Random;
import java.util.Scanner;

public class Inregration {

	public static void main(String[] args) {
		System.out.println("Welcome to the thunder dome of super crazy sentences. Please enter the number of the subject you want to construct a sentence with");		
		Scanner input = new Scanner (System.in);
		System.out.print("1. Person, 2. Animal, 3. Country, 4. Answer to the meaning of life, or 5. Music:");
		// variables are essentially an object. The most common type of varibales are primative data types. these include int, double, byte, short, long, float, char, and boolean. 
		// int is a whole number with a minimum value of -231 and a maximum value of 231-1.
		// double is a number rounded to two decimal places
		//byte has minimum value of -128 and a maximum value of 127 (inclusive).
		//short has a minimum value of -32,768 and a maximum value of 32,767 (inclusive)
		//long has a minimum value of -263 and a maximum value of 263-1
		//float is like a double but is used to if a large array needs to be saved 
		// boolean has only two value true or false
		// char has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
		int Userinput = input.nextInt();
			while(Userinput < 1 || Userinput > 5)
			{
				if (Userinput < 1) {
					System.out.println("Invalid entry: A grade school child could follow these instructions, please try again or go back to school");
					Userinput = input.nextInt();
				}
				else if (Userinput > 5) {
					System.out.println("Invalid entry: I have seen mice follow better instructions");
					Userinput = input.nextInt();
				}
				
			}
			Random rand = new Random();
			int  AdjetiveNumber = rand.nextInt(4) + 1;
			String Adjetive = null;
			    switch (AdjetiveNumber) {
			        case 1: Adjetive = "amatory";
			            break;
	            	case 2: Adjetive = "adamant";
	            	    break;
	            	case 3: Adjetive = "baleful";
	            			break;
	            	case 4: Adjetive = "fastidious";
	            			break;
			     }
		//changing int to String
		String numberAsString = Integer.toString(AdjetiveNumber);
		System.out.println("Now displaying " + Adjetive + " Which was generated from the number " + numberAsString);
		//using substring to get the first letter of the adjetive
		System.out.println("The adjetive starts with the letter " + Adjetive.substring(0, 1));
		System.out.println("dividing two intergers will always result in a whole number that is rounded down");
		System.out.println("The reason is becasue int is a data type that is a whole number so it cuts off the decimal value");
		System.out.println("For example 9 divided by 4 equals 2.25 but if we divede with intergers the answer would be " + (9/4));
	}
}
