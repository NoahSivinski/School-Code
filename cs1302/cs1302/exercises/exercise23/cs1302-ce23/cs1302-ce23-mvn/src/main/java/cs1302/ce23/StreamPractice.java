package cs1302.ce23;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Some starter code for practicing with streams. This class
 * creates a random {@code List} of {@code Employee} objects.
 * Streams can be used to process the elements of the list
 * efficiently with less code than loops.
 */
public class StreamPractice {

    private static final int NUM_EMPLOYEES = 10;

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();

        // Generate employees
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            employees.add(Employee.genEmployee());
        } // for

        // Print information about the employees
        for (Employee e: employees) {
            System.out.println(e);
        } // for

        System.out.println("YOUR STUFF BELOW\n");

        // Your code here
        System.out.println("CHECKPOINT 2.1: LEVEL 3 EMPLOYEES");
        employees
            .stream()
            .filter(e -> e.getLevel() == 3)
            .forEach(System.out::println);

        System.out.println("\nCHECKPOINT 2.2: INCOME > 200k");
        employees
            .stream()
            .filter(e -> e.getGross() > 200_000)
            .map(Employee::getGross)
            .map(gross -> String.format("$%1.2f", gross))
            .forEach(System.out::println);

        System.out.println("\nCHECKPOINT 2.3: NET INCOME");
        employees
            .stream()
            .map(emp -> getNetIncome(emp))
            .map(net -> String.format("$%1.2f", net))
            .forEach(System.out::println);

        System.out.println("\nCHECKPOINT 3.1:");
        System.out.printf("$%1.2f", employees
                          .stream()
                          .filter(e -> (e.getGross() > 100_000 && e.getLevel() == 2))
                          .map(emp -> getNetIncome(emp))
                          .reduce(0.0, (a, b) -> a + b));

        System.out.println("\nCHECKPOINT 3.2:");
        double sum = 0;
        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            if (emp.getGross() > 100_000 && emp.getLevel() == 2) {
                sum += getNetIncome(emp);
            } //if
        } //for
        System.out.printf("$%1.2f\n", sum);

    } // main

    /**
     * Returns the net income for the specified Employee.
     * @param emp specified Employee
     * @return net income of emp
     */
    public static Double getNetIncome(Employee emp) {
        return emp.getGross() -
            Arrays.stream(emp.getDeductions())
            .reduce(0, (a, b) -> a + b);
    } //getNetIncome

} // StreamPractice
