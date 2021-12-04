package Polynomial;
import RationalFraction.RationalFraction;

public class Polynomial {
    RationalFraction[] coefficients;
    public Polynomial(RationalFraction[] array) {
        coefficients = array;
    }
    public Polynomial Add(Polynomial a, Polynomial b) {
        if (a.coefficients.length != b.coefficients.length) {
            System.out.println("wrong length");
            return a;
        }
        RationalFraction[] newCoefficients = new RationalFraction[a.coefficients.length];
        for (int i = 0; i < a.coefficients.length; i++) {
            newCoefficients[i] = RationalFraction.Add(a.coefficients[i], b.coefficients[i]);
        }
        return new Polynomial(newCoefficients);
    }
    public void print() {
        for (RationalFraction r : this.coefficients) {
            RationalFraction.print(r);
        }
    }
}
