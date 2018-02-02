package ooplap8;

public class Cat  extends Pet{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Mall Mall !!!");
    }
}//class