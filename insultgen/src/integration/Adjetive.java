package integration;

import java.util.Random;

class Adjetive {
   static int getRandom() {
        Random rand = new Random();
        int  adjetiveNumber = rand.nextInt(12) + 1;
        return adjetiveNumber;   
    }
    static String getAdjetive () {
    int adjetiveNumber = Adjetive.getRandom();
    String adjetive = null;
        switch (adjetiveNumber) {
            case 1: adjetive = "amatory";
                break;
            case 2: adjetive = "adamant";
                break;
            case 3: adjetive = "baleful";
                 break;
            case 4: adjetive = "fastidious";
                break;
            case 5: adjetive = "adroit";
                break;
            case 6: adjetive = "caustic";
                break;
            case 7: adjetive = "arcadian";
                break;
            case 8: adjetive = "bellicose";
                break;
            case 9: adjetive = "boorish";
                break;
            case 10: adjetive = "casustic";
                break;
            case 11: adjetive = "billious";
                break;
            case 12: adjetive = "dowdy";
                break;
        }
        return adjetive;
    }
 }


        

