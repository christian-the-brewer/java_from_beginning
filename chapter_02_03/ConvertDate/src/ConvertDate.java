import java.util.Scanner;

public class ConvertDate {
    public static void main(String[] args) {
        //convert string input of month day, year into day month year


        String day = "", month = "", year = "";
        int wordCounter = 0;
        char prev = ' ', current;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date to be converted:" );
        String userInput = scanner.nextLine().toLowerCase().trim();// start by converting input to lowercase and trimming

        for (int i = 0; i < userInput.length(); i++) {
            current = userInput.charAt(i);
            if (current == ' ') {
                if (prev != ' ') {
                    wordCounter += 1;
                }
            } else if (current == ',') {
                continue;
            } else {
                switch (wordCounter) {
                    case 0:
                        month += current;
                        break;
                    case 1:
                        day += current;
                        break;
                    case 2:
                        year += current;
                        break;
                    default:
                        break;
                }
            }
            prev = current;
        }
        //title month
        char titledLetter = Character.toUpperCase(month.charAt(0));

        //create new string
        String titledMonth = Character.toString(titledLetter);
        for (int i = 1; i < month.length(); i++) {
            titledMonth += month.charAt(i);
        }

        System.out.println(day + " " + titledMonth + " " + year);




        scanner.close();
    }
}
