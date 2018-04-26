package integration;

import java.util.Random;

/**
 * generates a random adjective.
 * Finds the lowest value between two ints.
 * @author Ryan McGuire
 *
 */

class Adjective {
  
  /**
   * compares two int data types and brings back the smallest of the two.
   * @param number1 number value to be compared to the other parameter.
   * @param number2 number value to be compared to the other parameter.
   * @return the smallest value between number1 and number2.
   */
  public static int getMin(int number1, int number2) {
    int min;
    if (number1 > number2) {
      min = number2;
    } else {
      min = number1;
    }
    return min;
  }

  
  /**
   * generates a random number.
   * @return random number generated.
   */
  static int getRandom() {
    Random rand = new Random();
    int adjectiveNumber = rand.nextInt(17) + 1;
    return adjectiveNumber;
  }

  
  /**
   * Uses a switch statement that gets a random number from the getRandom
   * method.
   * @return an adjective from the switch statement.
   */
  static String getAdjective() {
    int adjectiveNumber = Adjective.getRandom();
    String adjective = null;
    switch (adjectiveNumber) {
      case 1:
        adjective = "amatory";
        break;
      case 2:
        adjective = "adamant";
        break;
      case 3:
        adjective = "baleful";
        break;
      case 4:
        adjective = "fastidious";
        break;
      case 5:
        adjective = "adroit";
        break;
      case 6:
        adjective = "caustic";
        break;
      case 7:
        adjective = "arcadian";
        break;
      case 8:
        adjective = "bellicose";
        break;
      case 9:
        adjective = "boorish";
        break;
      case 10:
        adjective = "casustic";
        break;
      case 11:
        adjective = "billious";
        break;
      case 12:
        adjective = "dowdy";
        break;
      case 13:
        adjective = "corpulent";
        break;
      case 14:
        adjective = "calamitous";
        break;
      case 15:
        adjective = "defamatory";
        break;
      case 16:
        adjective = "didactic";
        break;
      case 17:
        adjective = "comely";
        break;
      case 18:
        adjective = "dilatory";
        break;
      default:
        break;
    }
    return adjective;
  }
}
