import java.io.*;
import java.util.*;

public class MoneyMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        for(int i = 0; i < tests; i++){
            int money = sc.nextInt();
            int thousands = money / 1000;
            money = money - (thousands * 1000);
            int hundreds = money / 100;
            money = money - (hundreds * 100);
            int fifties = money / 50;
            money = money - (fifties * 50);
            int twenties = money / 20;
            money = money - (twenties * 20 );
            int tens = money / 10;
            money = money - (tens * 10);
            int fives = money / 5;
            money = money - (fives * 5);
            int ones = money;
            System.out.println(thousands + ":" + hundreds + ":" + fifties + ":" + twenties + ":" + tens + ":" + fives + ":" + ones);
        }
        sc.close();
    }
}