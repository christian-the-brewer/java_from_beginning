public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int num) {
        numerator = num;
        denominator = 1;
    }

    public Fraction(int num, int denom) {
        numerator = num;
        denominator = denom;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int num) {
        numerator = num;
    }

    public void setDenominator(int denom) {
        denominator = denom;
    }

    public Fraction add(Fraction f) {
        int num = numerator * f.denominator + denominator * f.numerator;
        int denom = denominator * f.denominator;
        return new Fraction(num, denom);
    }

    public Fraction subtract(Fraction f) {
        int num = numerator * f.denominator - denominator * f.numerator;
        int denom = denominator * f.denominator;
        return new Fraction(num, denom);
    }

    public Fraction multiply(Fraction f) {
        int num = numerator * f.numerator;
        int denom = denominator * f.denominator;
        return new Fraction(num, denom);
    }

    public Fraction divide(Fraction f) {
        int num = numerator * f.denominator;
        int denom = denominator * f.numerator;
        return new Fraction(num, denom);
    }

}
