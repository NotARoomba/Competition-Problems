import java.io.*;
import java.util.*;

public class RoyalSacrifice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        for(int a = 0; a < tests; a++){
            int num = sc.nextInt();
            int sendOff = sc.nextInt();
            Person[] p = new Person[num];
            for(int x = 0; x < num; x++){
                Scanner line = new Scanner(sc.nextLine());
                String name = line.next();
                int value = line.nextInt();
                p[x] = new Person(name, value);
            }
            int len = p.length;
            for (int i = 0; i < len - 1; i++){
                int min = i;
                for (int j = i+1; j < len; j++)
                    if (p[j].getName().compareTo(p[min].getName()) > 0){
                        min = j;
                    }               
                Person temp = p[min];
                p[min] = p[i];
                p[i] = temp;
            }
            for(int i = 0; i < len - sendOff; i++){
                
            }
        }
        sc.close();
    }
}


class Person{
    private String name;
    private int value;
    public Person(String n, int v){
        name = n;
        value = v;
    }
    public String getName(){
        return name;
    }
    public int getValue(){
        return value;
    }
}