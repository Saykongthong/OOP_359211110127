package ooplab7;

import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {
        SuperCar s1 = new SuperCar();
        s1 = inputData (s1);
        System.out.println(s1.toString());

    }
    private static SuperCar inputData(SuperCar s) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Insert your SuperCar info ");
        System.out.print("Car Brand : ");
        s.setCarbrand(scanner.nextLine());
        System.out.print("Car Color: ");
        s.setCarcolor(scanner.nextLine());
        System.out.print("Car Eengine Size: ");
        s.setCarenginesize(scanner.nextLine());
        System.out.print("Max Speed: ");
        s.setMaxspeed(scanner.nextLine());
        System.out.print("Countryo fo Rigin: ");
        s.setCountryoforigin(scanner.nextLine());
        return s;
    }//inputData
}


