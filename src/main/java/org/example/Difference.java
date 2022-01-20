package org.example;


public class Difference {
    private final double reduced;
    private final double deductible;
    private double result;

    public Difference(double reduced, double deductible) {
        this.reduced = reduced;
        this.deductible = deductible;
    }

    public void subtract() {
        result = reduced - deductible;
    }


    public double getResult() {
        return result;
    }

    public double getReduced() {
        return reduced;
    }

    public double getDeductible() {
        return deductible;
    }
}
