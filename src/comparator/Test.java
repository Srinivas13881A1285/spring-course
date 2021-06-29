package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Suresh", 20, 100);
        Employee employee2 = new Employee("Suman", 22, 1000);
        Employee employee3 = new Employee("Karthik", 25, 500);
        Employee employee4 = new Employee("Arjun", 19, 5000);


//        System.out.println(employee1);
//        System.out.println(employee2);
        // arraylist


        ArrayList<Employee> employees = new ArrayList();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Collections.sort(employees);//default comparator

        System.out.println("Employees sorted based on age");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("Employees sorted based on salary");


        SalaryComparator salaryComparator = new SalaryComparator();

        Collections.sort(employees, salaryComparator);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("Tree set age");
//        TreeSet<Employee> treeSet = new TreeSet<>();
        TreeSet<Employee> treeSet = new TreeSet<>(salaryComparator);
        treeSet.add(employee1);
        treeSet.add(employee2);
        treeSet.add(employee3);
        treeSet.add(employee4);


        for (Employee employee : treeSet) {
            System.out.println(employee);
        }
    }
}
//Object

//toString()

//completeclassname@hashcode
