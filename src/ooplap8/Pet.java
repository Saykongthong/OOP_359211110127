package ooplap8;

public abstract class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //เขียนขึ้นเอง  public  void  makeNoise();  เพิ่ม  abstract  ลงไป  //abstractใน class จะต้องเป็น abstract ด้วย
    public abstract void  makeNoise();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
