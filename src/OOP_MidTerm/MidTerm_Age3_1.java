package OOP_MidTerm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MidTerm_Age3_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int age,year;
        int a = 1;
        String i;
        do {
           do { System.out.print(" Enter year " +a+ " : ");
            i = stdin.readLine();
            year = Integer.parseInt(i);
            age = 2561 - year;
            System.out.print(" Age " +a+ " : " + age);
            System.out.println(" ");
            a++;
        }
        while (a<=3);
        }
         while (a==1);
            System.out.println("Thank Your.");
    }//main
}//class
