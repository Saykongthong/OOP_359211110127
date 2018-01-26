package ooplab7;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        //create object as Student
        Student s1 = new Student();
        s1.setId("0001");
        s1.setName("Pornsuda");
        s1.setPid("1809900638256");
        s1.setAddress("11/11 T.Thamyai A.Thungsong");
        System.out.println(s1.toString());

        Student s2 = new Student("0002",
                "Girl Saiyai",
                "1809900638255",
                "22/22 T.Thawang A.Muang");
        System.out.println(s2.toString());

        Student s3 = new Student();
    //   s3 = inputData (s3);
    //  System.out.println(s3.toString());

        System.out.println(s2.getId());
        s2.setId("004");
        System.out.println(s2.getId());
        s2.group="IS223";
        System.out.println(s2.group);
        System.out.println(Student.age);
        Student.age=20;
        s2.age = 30;
        System.out.println(Student.age);
        System.out.println(s2.age);

    }//main

    private static Student inputData(Student s) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Insert your student info ");
        System.out.print("Student ID: ");
        s.setId(scanner.nextLine());
        System.out.print("Student Name: ");
        s.setName(scanner.nextLine());
        System.out.print("Person ID: ");
        s.setPid(scanner.nextLine());
        System.out.print("Address: ");
        s.setAddress(scanner.nextLine());
        return s;
    }//inputData
}//class
