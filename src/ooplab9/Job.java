package ooplab9;

public class Job {
    private String position;
    private int salary;

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Job{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary(int i) {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Job(String position, int salary) {
        this.position = position;
        this.salary = salary;

    }
}