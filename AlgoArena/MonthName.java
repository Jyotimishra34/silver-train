import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of the month
        System.out.print("Enter the number of the month (1-12): ");
        int monthNumber = scanner.nextInt();

        // Initialize a variable to hold the name of the month
        String monthName;

        // Determine the name of the month based on the number
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month number";
                break;
        }

        // Print the name of the month
        System.out.println("The month is: " + monthName);

        // Close the scanner
        scanner.close();
    }
}