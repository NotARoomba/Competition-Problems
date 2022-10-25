

import java.io.*;
import java.util.*;
public class JestersJokes 
{
private static int count;
private static Set<String> names;
private static String name;
private static String word;
private static String names2;
    public static void main(String[] args) 
     {
       
        names = new TreeSet<String>();
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        for(int i = 0; i < count; i++)
        {
           name = sc.next() + sc.next();
            while(sc.hasNext())
            {
               word = sc.next();
               if(word.equalsIgnoreCase("Stroud") && !name.substring(0, name.length()).equals("Jester"))
               names.add(name.substring(0, name.length()));
            }
            sc.nextLine();
        }
        for( String a : names)
        names2 = names2 + a +"\n";
        System.out.println("Fungeon List: " + names2); 
     }
}