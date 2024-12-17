import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DepartmentAnalyzer {
    public List<Employer> department;


    public DepartmentAnalyzer(List<Employer> department) {
        this.department = department;
    }

    public void comparate (List<Employer> department1 ){

       List<String> g = department.stream().map(Employer::getName).toList();
       List<String> h = department1.stream().map(Employer::getName).toList();

       List<String> name = g.stream().filter(h::contains).toList();
       name.forEach(System.out::println);
    }

    public void oldest (int n){
        department.stream().map(Employer::getAge).sorted().skip(department.size() - n).forEach(System.out::println);


        System.out.println("\n");
    }

    public void workingYears(){
        long workingYears1 = department.stream()
                .filter(worker -> worker.getWorkingTime() >=10)
                .count();
        System.out.println(workingYears1);

    }

    public void salary(int n){
        Stream<Employer> salary = department.stream()
                .filter(worker -> worker.getSalary() > n);

        salary.forEach(System.out::println);
        System.out.println("\n");
    }

    public void first(){
        Stream<Employer> first = department.stream().filter(worker -> worker.getAge() >23).findFirst().stream();
        first.forEach(System.out::println);

        System.out.println("\n");
    }

    public void highestSalary(){
        Stream<Employer> higherSalary = department.stream().max((w,w1) -> w.getSalary() - w1.getSalary()).stream();
        higherSalary.forEach(System.out::println);

        System.out.println("\n");
    }

}
