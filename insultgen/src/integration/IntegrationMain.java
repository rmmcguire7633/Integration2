//Ryan McGuire integration project
//this program will generate a random adjective and will display multiple programming skills

package integration;
//aaa
import java.util.Scanner;

public class IntegrationMain {

  public static void main(String[] args) {
    System.out.println("Please enter the number of the subject you would like to explore");
    System.out.println("1 for Math, 2 for Strings (also gives a random adjetive), 3 for Classes and Objects, 4 for Arrays, 5 for Stringbuilder");
    Scanner input = new Scanner(System.in);
    String userChoice = input.nextLine();
    while (!userChoice.equals("1") && !userChoice.equals("2") && !userChoice.equals("3") && !userChoice.equals("4") && !userChoice.equals("5")) {
     System.out.println("Invalid entry, please try again");
      userChoice = input.nextLine(); 
    }
    if (userChoice.equals("1")) {
      doMathStuff();
    }
    else if (userChoice.equals("2")) {
      doStringStuff();
    }
    else if (userChoice.equals("3")) {
      doClassStuff();
      }
    else if (userChoice.equals("4")) {
      doArrayStuff();
    }
    else {
      doStringBuilder();
    }
  }
  private static void doClassStuff() {
 // using methods
    int number1 = 12;
    int number2 = 10;
    // calling method with the parameter of number1 and number2.
    int result = Adjetive.getMin(number1, number2);
    System.out.println(result);
    Account myAccount = new Account();
    Scanner input1 = new Scanner(System.in);
    System.out.println("Please enter the name:");
    String theName = input1.nextLine();
    // storing entered data into the Account class
    myAccount.setName(theName);
    // display the name stored in object myAccount also calling method with
    // () parameters or no parameters.
    System.out.println("Name in object myAccount is: " + myAccount.getName());
    //new object made with value passed to it through a constructor
    Account sample = new Account ("John Bonjovie", 56, 8675309.65);
    System.out.println("We created another object named sample in the Account");
    System.out.println("The name in the account is " + sample.getUserName());
    System.out.println("The age of the user in the account is " + sample.getAge());
    System.out.println("The wealth value of the user is $" + sample.getWealthValue());
  }

  private static void doStringStuff() {
    String adjective = Adjetive.getAdjetive();
    // method being called on line 39 with () as argument
    int adjetiveNumber = Adjetive.getRandom();
    // changing int to String
    String numberAsString = Integer.toString(adjetiveNumber);
    System.out.println("Now displaying " + adjective
        + " Which was generated from case " + numberAsString);
    // using substring to get the first letter of the adjetive
    System.out.println(
        "The adjective starts with the letter " + adjective.substring(0, 1));
    // using split
    String dog = "the dog is crazy ";
    System.out.println("The string dog is equal to " + dog );
    String[] dog1 = dog.split(" ");
    String dogMod = (dog1[0] + " " + dog1[3] + " " + dog1[1]);
    System.out.println("When we split the dog sting into 0, 3, and 1 we get " + dogMod);
    // using index of
    System.out
        .println("the index of i in the String dog is " + dog.indexOf('i'));
  }
  private static void doArrayStuff() {
    int [] forEachLoop = {1, 2, 3, 4, 5};
    for (int s:forEachLoop) {
      System.out.println(s);
    }
    Scanner userData = new Scanner(System.in);
    System.out.println("To calculate expenses on employees, please enter the number of employees");
    int size = userData.nextInt();
    double [] employeeSalary = new double [size];
    Scanner name = new Scanner(System.in);
    String [] employeeName = new String [size];
    for (int count = 1; count < employeeName.length +1; count++) {
      System.out.println("Enter employee " + count + "'s" + " first and last name.");
      employeeName [count -1] = name.nextLine();
      System.out.println("Enter the annual salary for " +  employeeName [count -1]);
      employeeSalary [count -1] = userData.nextDouble();
    }
    System.out.println("Empoyee\t\t\t\tSalary");
    for (int count = 0; count < employeeSalary.length; count++) {     
      System.out.println(employeeName[count] + "\t\t\t$" + employeeSalary[count]);
    }
    double minValue = employeeSalary[0];
    String minName = employeeName[0];
    for (int count = 1; count< employeeSalary.length; count++) {
      if(employeeSalary[count] < minValue) {
        minValue = employeeSalary[count];
        minName = employeeName[count];
      }
    }
    System.out.println("The lowest paid employee is " + minName + " and they are payed $" + minValue + " annualy");
    double sum = 0;
    for(int count = 0; count < employeeSalary.length; count++) {
      sum += employeeSalary[count];
    }
    System.out.println("The total expense for employees is $" + sum);
    System.out.println("Enter the name of the employee for their annual salary");
    String specificName = name.nextLine();
    boolean check = false;
    for (int count = 0; count < employeeName.length; count++) {
      if (employeeName[count].equals(specificName)) {
        System.out.println("Employee " + employeeName[count] + " was at element " + count + " and their salary is " + employeeSalary[count]);
        check = true;
      }
     }
    if (check == false) {
      System.out.println("The employee, " + specificName + ", was not found.");
    }
  }
  private static void doStringBuilder() {
    StringBuilder str = new StringBuilder("tuts ");
    System.out.println("string = " + str);    
    str.append('A');
    System.out.println("After append = " + str);
    str = new StringBuilder("abcd ");
    System.out.println("string = " + str);   
    str.append('!');
    System.out.println("After append = " + str);
    
    StringBuilder delete = new StringBuilder("Your mom's dog is cool");
    System.out.println("string = " + delete);
    delete.delete(4, 10);
    System.out.println("After deletion = " + delete);
    
    StringBuilder reverse = new StringBuilder("india");
    System.out.println("string = " + reverse);
    System.out.println("reverse = " + reverse.reverse());
    reverse = new StringBuilder("malayalam");
    System.out.println("string = " + reverse);
    System.out.println("reverse = " + reverse.reverse());
 }
  private static void doMathStuff() {
    // explaining math operations
    System.out.println(
        "dividing two integers will always result in a whole number that is rounded down");
    System.out.println(
        "The reason is because int is a data type that is a whole number so it cuts off the decimal value");
    // using double data type
    double nine = 9;
    double four = 4;
    System.out.println("For example 9 divided by 4 equals " + (nine / four)
        + " but if we divide with intergers the answer would be " + (9 / 4));
    // using boolean data type
    boolean coolbeans = true;
    System.out.println("Beans are cool. This statement is " + coolbeans);
    System.out.println(
        "To muliply data or numbers use the * key. For example 9 multiplied by 4 is "
            + (9 * 4));
    System.out.println(
        "The % key is used to perform modulo. Module means the remainder of two numbers divided. For example the remainder of 9 divided by 4 is "
            + (9 % 4));
    System.out.println(
        "The - is used to subtract data types and + is used to add data types. For example 9 -4 is "
            + (9 - 4) + " and 9 + 4 is " + (9 + 4));
  }
}
//Variables are memory that contain a data value.Variables are used to
// store information. for example we could have a box and assigning that
// box's width would be creating a variable for that box. The most
// common type of variables are primitive data types. these include int,
// double, byte, short, long, float, char, and boolean.
// int is a whole number with a minimum value of -231 and a maximum
// value of 230.
// double is a number rounded to two decimal places
// byte has minimum value of -128 and a maximum value of 127
// (inclusive).
// short has a minimum value of -32,768 and a maximum value of 32,767
// (inclusive)
// long has a minimum value of -263 and a maximum value of 263-1
// float is like a double but is used if a large array needs to be saved
// boolean has only two value true or false
// char has a minimum value of '\u0000' (or 0) and a maximum value of
// '\uffff' (or 65,535 inclusive).
//static means belonging to the class, and not the instances of the class.
