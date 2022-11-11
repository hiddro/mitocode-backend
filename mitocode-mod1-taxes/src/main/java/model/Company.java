package model;

import lombok.Getter;

@Getter
public class Company extends TaxPayer{
    private Integer numberofEmployees;

    public Company(String name, Double anualIncome, Integer numberofEmployees) {
        super(name, anualIncome);
        this.numberofEmployees = numberofEmployees;
    }

    @Override
    public double tax() {
        if(numberofEmployees > 10){
            return getAnualIncome() * 0.14;
        }
        return getAnualIncome() * 0.16;
    }
}
