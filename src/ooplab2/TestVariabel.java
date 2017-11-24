package ooplab2;

public class TestVariabel {
    public static void main(String[] args) {
     // Integer
        int i;
        i =10;
        System.out.print("i="+i);
        int j = 20;
        System.out.print("j ="+j);
        System.out.print("i+j+"+(i+j));

        //Double
        double v = 15.15;
        System.out.print(v);
        System.out.print(v*10);

       //Character
        char c = 'T';
        System.out.print(c);

        //String
        String s = "Hello,World";
        System.out.print(s);
        String name = " I'm Pornsuda";
        System.out.print(name);
        String msg = s + " " + name;
        System.out.print(msg);

        String msg2 = s.concat(" "+name);
        System.out.print(msg2);
        System.out.print(msg.length());
        System.out.print(msg.toUpperCase());
        System.out.print(msg.toLowerCase());

       // boolean ค่าความจริง ทดสอบเงื่อนไข
        boolean b = true;
        boolean b1 = false;
        System.out.print(b);
        System.out.print(b1);


    } // main




}// class
