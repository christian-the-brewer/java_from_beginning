import java.util.Scanner;

public class FractionMath {
    public FractionMath() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first fraction (x/x): ");
        String userFractionString1 = scanner.nextLine();
        System.out.println("Enter second fraction (x/x): ");
        String userFractionString2 = scanner.nextLine();
        String numer = "", denomer = "";
        boolean stillNumerator = true;
        for (int i = 0; i < userFractionString1.length(); i++) {
            if (userFractionString1.charAt(i) != '/') {
                if (stillNumerator) {
                    numer += userFractionString1.charAt(i);
                } else {
                    denomer += userFractionString1.charAt(i);
                }
            } else {
                stillNumerator = false;
            }
        }
        Fraction f1 = new Fraction(Integer.parseInt(numer), Integer.parseInt(denomer));
        numer = "";
        denomer = "";
        stillNumerator = true;
        for (int i = 0; i < userFractionString2.length(); i++) {
            if (userFractionString2.charAt(i) != '/') {
                if (stillNumerator) {
                    numer += userFractionString2.charAt(i);
                } else {
                    denomer += userFractionString2.charAt(i);
                }
            } else {
                stillNumerator = false;
            }
        }
        Fraction f2 = new Fraction(Integer.parseInt(numer), Integer.parseInt(denomer));
        Fraction addf = f1.add(f2);
        Fraction subtractf = f1.subtract(f2);
        Fraction multiplyf = f1.multiply(f2);
        Fraction dividef = f1.divide(f2);

        System.out.println("Sum: " + addf.getNumerator() + "/" + addf.getDenominator());
        System.out.println("Difference: " + subtractf.getNumerator() + "/" + subtractf.getDenominator());
        System.out.println("Product: " + multiplyf.getNumerator() + "/" + multiplyf.getDenominator());
        System.out.println("Quotient: " + dividef.getNumerator() + "/" + dividef.getDenominator());
        scanner.close();
    }
}
