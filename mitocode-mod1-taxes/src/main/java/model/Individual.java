package model;

import lombok.Getter;

@Getter
public class Individual extends TaxPayer{
    private Double healthExpenditures;

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double basicTax;
        if(getAnualIncome() < 20000.0){
            basicTax = getAnualIncome() * 0.15;
        }else{
            basicTax = getAnualIncome() * 0.25;
        }

        basicTax -= getHealthExpenditures() * 0.5;

        if(basicTax < 0){
            basicTax = 0;
        }

        return  basicTax;
    }
}
