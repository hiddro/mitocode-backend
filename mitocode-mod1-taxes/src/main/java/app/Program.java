package app;

import model.Company;
import model.Individual;
import model.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of tax payers: ");

        int numberOfTaxPayers = sc.nextInt();

        List<TaxPayer> list = new ArrayList<>();

        for (int i = 1; i <= numberOfTaxPayers; i++){
            System.out.println("TaxPayer #" + i + "data: ");
            System.out.println("Individual or Company (i/c)?");
            char type = sc.next().charAt(0);

            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Anual Income: ");
            Double anualIncome = sc.nextDouble();

            if (type == 'i'){
                System.out.println("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();

                Individual inv = new Individual(name, anualIncome, healthExpenditures);
                list.add(inv);
            }else{
                System.out.println("Number of employees: ");
                Integer numberOfEmployees = sc.nextInt();
                Company comp = new Company(name, anualIncome, numberOfEmployees);
                list.add(comp);
            }
        }

        System.out.println("====================");
        System.out.println("TAXES PAID");

        for (TaxPayer tax : list){
            System.out.println(tax.getName() + ": $ " + String.format("%.2f", tax.tax()));
        }

        System.out.println("====================");
        double sum = 0;
        for (TaxPayer tax : list){
            sum += tax.tax();
        }

        System.out.println("TOTAL TAXES: % " + String.format("%.2f", sum));
    }
}
