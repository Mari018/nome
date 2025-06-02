import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
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
      Stream<Integer> d =  department.stream().map(Employer::getAge).sorted().skip(department.size() - n);
      d.forEach(System.out::println);

        System.out.println("\n");
    }

    public void workingYears(int n){
        long workingYears1 = department.stream()
                .filter(worker -> worker.getWorkingTime() >= n)
                .count();
        System.out.println(workingYears1);

    }

    public void salary(int n){
        Stream<Employer> salary = department.stream()
                .filter(worker -> worker.getSalary() > n);

        salary.forEach(System.out::println);
        System.out.println("\n");
    }

    public void first(int n){
        Stream<Employer> first = department.stream();
        first.filter(worker -> worker.getAge() > n).findFirst().stream().findFirst().ifPresent(w -> System.out.println(w.getName()));

        System.out.println("\n");
    }

    public void averageSalary(){

       OptionalDouble average = department.stream().mapToInt(Employer::getSalary).average();
        System.out.println(average);

        System.out.println("\n");
    }

}
