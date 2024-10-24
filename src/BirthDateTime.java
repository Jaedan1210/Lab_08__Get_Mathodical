import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean leapYear = false;

        // Ask for year input
        int birthYear = SafeInput.getRangedInt(in, "Please enter a year between 1950 and 2015: ", 1950, 2015);

        // Check if it's a leap year
        if ((birthYear % 4 == 0 && birthYear % 100 != 0) || (birthYear % 400 == 0)) {
            leapYear = true;
        }

        // Ask for month input
        int birthMonth = SafeInput.getRangedInt(in, "Please enter a month between 1 and 12: ", 1, 12);

        // Determine the number of days in the selected month
        int birthDay = 0;
        switch (birthMonth) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                birthDay = SafeInput.getRangedInt(in, "Please enter a day between 1 and 31: ", 1, 31);
                break;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                birthDay = SafeInput.getRangedInt(in, "Please enter a day between 1 and 30: ", 1, 30);
                break;
            case 2:  // February
                if (leapYear) {
                    birthDay = SafeInput.getRangedInt(in, "Please enter a day between 1 and 29: ", 1, 29);
                } else {
                    birthDay = SafeInput.getRangedInt(in, "Please enter a day between 1 and 28: ", 1, 28);
                }
                break;
        }

        // Ask for hour input
        int birthHour = SafeInput.getRangedInt(in, "Please enter an hour between 0 and 23: ", 0, 23);

        // Ask for minute input
        int birthMinute = SafeInput.getRangedInt(in, "Please enter a minute between 0 and 59: ", 0, 59);

        // Format the output to ensure the time is correctly displayed
        System.out.printf("You were born on %02d/%02d/%04d at %02d:%02d%n", birthMonth, birthDay, birthYear, birthHour, birthMinute);
    }
}
