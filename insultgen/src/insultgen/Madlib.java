package insultgen;
import java.util.Random;
import java.util.Scanner;
public class Madlib {
	private static Scanner input;
	public static void main(String[] args) {
		System.out.println("Welcome to the thunder dome of super crazy sentences. Please enter the number of the subject you want to construct a sentence with");		
		input = new Scanner (System.in);
		System.out.print("1. Person, 2. Animal, 3. Country, 4. Answer to the meaning of life, or 5. Music:");
		int number = input.nextInt();
			while(number<1 || number>5)
			{
				System.out.println("Invalid entry: A grade school child could follow these instructions, please try again or go back to school");
				number = input.nextInt();    
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
				System.out.println(Adjetive);
	}
}	
