//SellStocks program
//Author: Christian Brewer
//11/25/23

import java.util.Scanner;

//Program calculates value of stock sale. Eser inputs stock price, number of shares, and commission percent
//to see value of total and see commission amount and net value after commission is accounted for.
public class Main {
    public static void main(String[] args) {
        //variables for stock price, number, and commissionRate
        double stockPrice, commissionRate, valueOfShares;
        int numberOfShares;

        Scanner scanner = new Scanner(System.in); //scanner for user input
        System.out.println("-----Stock Calculator-----");
        System.out.println("Enter price of stock: ");
        stockPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter number of shares: ");
        numberOfShares = Integer.parseInt(scanner.nextLine());
        valueOfShares = numberOfShares * stockPrice;
        //print out valuation of shares
        System.out.println("Value of shares: " + valueOfShares);

        System.out.println("Enter commissionRate rate (as percentage): ");
        commissionRate = Double.parseDouble(scanner.nextLine()) / 100d;
        System.out.println("Commission: " + commissionRate * valueOfShares );
        System.out.println("Net proceeds: " + (valueOfShares - commissionRate * valueOfShares));


    }
}