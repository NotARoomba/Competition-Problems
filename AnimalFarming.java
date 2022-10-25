import java.io.*;
import java.util.*;
public class AnimalFarming
{
private static int count;
private static int a;
private static int b;
private static int c;
private static int d;

     public static void main(String[] argc) 
     {
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        for(int i = 0; i < count; i++)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();

            System.out.println(whatAnimal(a, b, c, d));
        }

     }

     public static String whatAnimal(int a, int b, int c, int d)
     {
        if(a == b && b == c && c == d)
            return "sheep";
        else if(a == c && b == d)
            return "cattle";
        return "pigs";
     }

}







/*5
Sir McMurry: 
We argued all day about what to call a medieval soldier.
But it was getting late so we decided to call it a knight.

Sir Nutt:
Why does Stroud have a roundtable in his court? So that none of his other knights can corner him!

Jester:
What is the rain's favorite medieval reenactment? Storming a castle.
Look! Stroud has his shoes on backwards!

Sir McMurry:
What did Stroud say when he heard that the peasants were revolting? 
He said he agrees because they never bathe and always stink.

Empress Castillo:
What do medieval postmen wear? Chainmail.*/