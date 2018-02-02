package ooplap8;

public class Person {
    //เขียนขึ้นเอง
    private String personID;
    private String name;
    private String address;
    private String gender;
    //constructor กด ait+ Insert  กด constructor 1

    public Person(String personID, String name, String address, String gender) {
        this.personID = personID;
        this.name = name;
        this.address = address;
        this.gender = gender;
    }
    //กด Ait+ Insert  กด toString 3
    @Override
    public String toString() {
        return "Person{" +
                "personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
    //geyyer and srtter methods กด Ait+ Insert  กด geyyer and srtter 2

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}//class
