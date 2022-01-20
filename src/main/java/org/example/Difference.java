package org.example;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Difference")
@XmlType(propOrder = {"reduced", "deductible", "result"})
public class Difference {
    private double reduced;
    private double deductible;
    private double result;

    public Difference() {}

    public Difference(double reduced, double deductible) {
        this.reduced = reduced;
        this.deductible = deductible;
    }

    public void subtract() {
        result = reduced - deductible;
    }

    @XmlElement(name = "result")
    public double getResult() {
        return result;
    }

    @XmlElement(name = "reduced")
    public double getReduced() {
        return reduced;
    }

    @XmlElement(name = "deductible")
    public double getDeductible() {
        return deductible;
    }
}
