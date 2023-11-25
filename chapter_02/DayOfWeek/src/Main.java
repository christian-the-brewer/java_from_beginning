//DayOfWeek calculator
//Author: Christian Brewer
//11/25/23

//Returns day of the week given a date

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //vars to hold pieces of date for Zeller's Congruence formula.
        int year, century, yearOfCentury, month, dayOfMonth, zellersDay;
        String day;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year: ");
        year = Integer.parseInt(scanner.nextLine());
        century = year / 100; //extract century and year
        yearOfCentury = year % 100;
        System.out.println("Enter month: ");
        month = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter day: ");
        dayOfMonth = Integer.parseInt(scanner.nextLine());

        //formula in action
        zellersDay = (dayOfMonth + 26 * (month + 1) / 10 + yearOfCentury + (yearOfCentury / 4) + (century / 4) + (5 * century)) % 7;
        switch (zellersDay) {
            case 0:
                day = "Saturday";
                break;
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            default:
                day = "??";
        }
        System.out.println("The day of the week on " + century + yearOfCentury + "/" + month + "/" + dayOfMonth + " is " + day);

    }
}