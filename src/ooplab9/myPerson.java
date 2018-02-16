package ooplab9;

public class myPerson {
    public static void main(String[] args) {
        Person person = new Person("Pornsuda", 18,
                new Address("187/3", "Nakhorsithammarat",
                        "80000"),
                new Job("bitoey", 15000));


        System.out.println(person.toString());

        //edit data of object
        person.getJob().setSalary(15000);
        System.out.println(person.getJob().getPosition());
        //System.out.println(person.getJob().getSalary());
    }
    }

