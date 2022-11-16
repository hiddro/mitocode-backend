package com.mitocode.stream;

import com.mitocode.function.Employee;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AppStream {

    private void m1GetDevelopers(List<Employee> list, String searchText){
        Predicate<Employee> predicate = e -> e.getJob().equalsIgnoreCase(searchText);

        List<Employee> newList = list.stream()
                                    .filter(predicate)
                                    .collect(Collectors.toList());

        newList.forEach(System.out::println);
    }

    private void m2GetInverse(List<Employee> list){
        Comparator<Employee> inverso = (x1, x2) -> x2.getIdEmployee() - x1.getIdEmployee();

        list.stream()
                .sorted(inverso)
                .forEach(System.out::println);
    }

    private void m3GetAdults(List<Employee> list){
        Predicate<Employee> isAdult = e -> Period.between(e.getBirthDate(), LocalDate.now()).getYears() >= 18;

        list.stream()
                .filter(isAdult)
                .forEach(System.out::println);
    }

    private void m4GetOldestAdults(List<Employee> list){
        list.stream()
                .sorted(Comparator.comparing(Employee::getBirthDate))
                .limit(1)
                .forEach(System.out::println);
    }

    public void m5GetMaxMinSalary(List<Employee> list){
        double max = list.stream()
                        .mapToDouble(Employee::getSalary)
                        .max()
                        .orElse(0);

        System.out.println("max salary = " + max);

        double min = list.stream()
                        .mapToDouble(Employee::getSalary)
                        .min()
                        .orElse(0);

        System.out.println("min salary = " + min);

        Employee emp = list.stream()
                        .max(Comparator.comparing(Employee::getSalary))
                        .orElse(new Employee());
//                        .getName(); // sin esto la variable emp seria Employee en vez de String

        System.out.println("employee max salary = " + emp);
    }

    public void m6GetAverage(List<Employee> list){
        double avg = list.stream()
                        .mapToDouble(Employee::getSalary)
                        .average()
                        .orElse(0);

        System.out.println("avg = " + avg);
    }

    public void m7GetSummary(List<Employee> list){
        DoubleSummaryStatistics stats = list.stream()
                                            .mapToDouble(Employee::getSalary)
                                            .summaryStatistics();

        System.out.println("stats = " + stats);
        System.out.println("Count = " + stats.getCount());
        System.out.println("Average = " + stats.getAverage());
        System.out.println("Max = " + stats.getMax());
        System.out.println("Min = " + stats.getMin());
        System.out.println("Sum = " + stats.getSum());
    }

    public static void main(String[] args) {
        AppStream app = new AppStream();

        Employee e1 = new Employee(1, "Mito1", "Developer", LocalDate.of(1991, 1, 1), 1000.00, "TI");
        Employee e2 = new Employee(2, "Mito2", "QA", LocalDate.of(1993, 2, 1), 2000.00, "TI");
        Employee e3 = new Employee(3, "Mito3", "Developer", LocalDate.of(1995, 3, 1), 3000.00, "TI");
        Employee e4 = new Employee(4, "Mito4", "Cloud Engenieer", LocalDate.of(1987, 4, 1), 4000.00, "TI");
        Employee e5 = new Employee(5, "Mito5", "DevOps Engenieer", LocalDate.of(1956, 1, 1), 5000.00, "TI");
        Employee e6 = new Employee(6, "Mito6", "Scrum Master", LocalDate.of(2002, 11, 1), 4500.00, "TI");
        Employee e7 = new Employee(7, "Mito7", "Leader Project", LocalDate.of(1998, 12, 1), 10000.00, "TI");
        Employee e8 = new Employee(8, "Mito8", "Senior Developer", LocalDate.of(1996, 7, 1), 7000.00, "TI");
        Employee e9 = new Employee(9, "Mito9", "Junior Developer", LocalDate.of(2005, 8, 1), 500.00, "TI");
        Employee e10 = new Employee(10, "Mito10", "Mobile Developer", LocalDate.of(1975, 9, 1), 3000.00, "TI");

        List<Employee> list = List.of(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
//        app.m1GetDevelopers(list, "Developer");
        app.m7GetSummary(list);
    }
}
