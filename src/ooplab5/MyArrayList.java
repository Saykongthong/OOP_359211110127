package ooplab5;

import java.util.ArrayList;
//ต้องเขียนขึ้นเอง พอพิม ArrayList list = new ArrayList();
//MyArrayList เป็นการจองข้อมูล เราสามารถเพิ่มหรือลบก็ได้
//addเป็นการเพิ่มต่อท้ายไปเรื่อย
public class MyArrayList {
    public static void main(String[] args) {
        //ArrayList
        ArrayList list = new ArrayList();
        String name = "TOEY";
        list.add(name);
        System.out.println(list);
        list.add("TAN");
        list.add("KUS");
        System.out.println(list);
        list.add(2,"ADAM");
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        list.add(10.10);
        System.out.println(list);
        list.remove("TAN");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));//เรียกสองตำแหน่ง
        System.out.println(list.indexOf("ADAM"));//เรียกจากที่ไหน
    }//main
}//Class
