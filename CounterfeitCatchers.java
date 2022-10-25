import java.io.*;
import java.util.*;

public class CounterfeitCatchers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //gets test cases
        for (int i = 0; i < sc.nextInt(); i++) {
            int coinNumber = sc.nextInt();
            int coinLength = sc.nextInt();
            String coinString = "";
            boolean first = true;
            int counterfeit;

            for (int f = 0; f<coinNumber; f++) {
                String currentCoin = "";
                for (int g = 0; g<coinLength;g++) {
                    if (first) {
                        coinString += sc.nextLine();
                    } else {
                        currentCoin += sc.nextLine();
                    }
                }

                if (!currentCoin.matches(coinString) && !first) {
                    counterfeit = f+1;
                    if (counterfeit == 2) {
                        String cc = "";
                        for (int g = 0; g<coinLength;g++) {
                            cc += sc.nextLine();
                        }
                        if (!cc.matches(coinString) && !currentCoin.matches(coinString)) {
                            System.out.println("Sir, coin 1 is a counterfeit!");
                            return;
                        }
                    }
                    System.out.println("Sir, coin " + counterfeit + " is a counterfeit!");
                    return;
                }
                else if (first) first = false;
            }
        }
     }
}