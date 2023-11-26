import java.util.Scanner;

public class TestFraction {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 2);
        Fraction f3 = f1.divide(f2);
        System.out.println(f3.getNumerator());
        System.out.println(f3.getDenominator());
        new FractionMath();

    }
}

