//Ryan McGuire

package integration;

import java.util.Random;

class Adjetive {
  // Method header. the parameters are int number1 and int number2
  public static int getMin(int number1, int number2) {
    int min;
    if (number1 > number2) {
      min = number2;
    } else {
      min = number1;
    }
    return min;
  }

  // Method header. The parameters are () or no parameters
  static int getRandom() {
    Random rand = new Random();
    int adjetiveNumber = rand.nextInt(17) + 1;
    return adjetiveNumber;
  }

  //Method header. the parameters are () or no parameters
  static String getAdjetive() {
    int adjetiveNumber = Adjetive.getRandom();
    String adjetive = null;
    switch (adjetiveNumber) {
      case 1:
        adjetive = "amatory";
        break;
      case 2:
        adjetive = "adamant";
        break;
      case 3:
        adjetive = "baleful";
        break;
      case 4:
        adjetive = "fastidious";
        break;
      case 5:
        adjetive = "adroit";
        break;
      case 6:
        adjetive = "caustic";
        break;
      case 7:
        adjetive = "arcadian";
        break;
      case 8:
        adjetive = "bellicose";
        break;
      case 9:
        adjetive = "boorish";
        break;
      case 10:
        adjetive = "casustic";
        break;
      case 11:
        adjetive = "billious";
        break;
      case 12:
        adjetive = "dowdy";
        break;
      case 13:
        adjetive = "corpulent";
        break;
      case 14:
        adjetive = "calamitous";
        break;
      case 15:
        adjetive = "defamatory";
        break;
      case 16:
        adjetive = "didactic";
        break;
      case 17:
        adjetive = "comely";
        break;
      case 18:
        adjetive = "dilatory";
        break;
      default:
        break;
    }
    return adjetive;
  }
}
