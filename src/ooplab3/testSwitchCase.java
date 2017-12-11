package ooplab3;

import java.util.Scanner;

public class testSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        switch (number){
            case 1: System.out.println("Your entered 1.");break;
            case 2: System.out.println("Your enteres 2.");break;
            case 3: System.out.println("Your enteres 3.");break;
            default: System.out.println("Please enter number 1-3.");break;

        }//switch
    }
}
