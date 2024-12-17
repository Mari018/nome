import java.util.Comparator;

public class Employer {

    private int age;
    private int workingTime;
    private int salary;
    private String name;

    public Employer(int age, int workingTime, int salary, String name) {
        this.age = age;
        this.workingTime = workingTime;
        this.salary = salary;
        this.name = name;
    }
    public Employer(){}

    public int getAge() {
        return age;
    }

    public int getWorkingTime() {
        return workingTime;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "age=" + age +
                ", workingTime=" + workingTime +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }


}
