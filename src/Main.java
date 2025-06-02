import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Employer> Departement = Arrays.asList(
                new Employer(22,10,2500,"raquel"),
                new Employer(45,15,10000,"mario"),
                new Employer(45,9,2000,"henrique"),
                new Employer(24,9,5000,"joao"));


        List<Employer> Department2 = Arrays.asList(
                new Employer(21,15,6000,"joao"),
                new Employer(34,9,2000,"joana"),
                new Employer(20,10,7000,"ricardo"),
                new Employer(24,20,5090,"artur"));


        DepartmentAnalyzer comparate = new DepartmentAnalyzer(Departement);

    comparate.comparate(Department2);
    comparate.oldest(3);
    comparate.workingYears(10);
    comparate.salary(2000);
    comparate.first(23);
    comparate.averageSalary();


    }
}