package ooplab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class MyArray2D {
    public static void main(String[] args) throws IOException {
    //    Array D2
          int [] [] number = new int [2] [3];
          number = InputData (number);
          ShowArray(number);


    }//main
    //เป็นการโชว์ข้อมูล2Array 1.ต้องพิมShowArray(number);ก่อนและจะได้ด้านล่างมา
    private static void ShowArray(int[][] number) {
        System.out.println("showData : ");
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++)
                System.out.print(number[i][j] + " ");

        }

    }
    private static int[][] InputData(int[][] number) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer ");
        for (int i=0;i<number.length;i++){
            for (int j=0;j<number[i].length;j++){
                System.out.print("number["+i+"]["+j+"]: ");
                number[i][j]= Integer.parseInt(reader.readLine());
            }

        }


        return number;
    }//InputData
}//Class
