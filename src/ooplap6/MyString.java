package ooplap6;

public class MyString {
    public static void main(String[] args) {
    char []c = {'H','e','l','l','o'}  ;
    String str1 = new String(c);
    System.out.println(str1);

    String str2 ="Pornsuda";//วิธีที่ง่ายที่สุดในการเขียน
    System.out.println(str2);

    String str3 = new String("RMUTSV");
    System.out.println(str3);

    //concatenation String
    //type (+)
    String str4 = str1+" "+str2;
    System.out.println(str4);
    //type (concat() method)
    String str5 = str1.concat (" "+str3);
    System.out.println(str5);

    //String size การนับตัวอักษร
    int length = str4.length();
    System.out.println(length);
    System.out.println(str5.length());

    //String method
    System.out.println(str5.toLowerCase());//ตัวอักษรตัวเล็ก
    System.out.println(str5.toUpperCase());//ตัวอักษรตัวใหญ่
    System.out.println(str5.replace('l','s'));//เปลี่ยนจาก l เป็น s
    System.out.println(str5.indexOf('V')); //การนับว่า V อยู่ตัวที่เท่าไร

    //trim()
    String str6 = "  Hello  ";
    System.out.println(str6.length());//length การนับอักษร
    System.out.println("*"+str6+"*");
    System.out.println("*"+str6.trim()+"*");//trim การตัดช่องว่างออก




    }//main
}//class
