package Q2;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DrivingLicenseApplication {
    public static void main(String[] args) {
        getDateOfBirthFromDriver();
    }

    private static void getDateOfBirthFromDriver() {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Step 1: Enter Drivers Birth Year in format YYYY");

        String strYear = myObj.nextLine();  // Read user input
        int year = Integer.parseInt(strYear);
        System.out.println("Step 2: Enter Drivers Birth Month");

        String strMonth = myObj.nextLine();  // Read user input
        int month = Integer.parseInt(strMonth);

        System.out.println("Step 3: Enter Drivers Birth Date");

        String strDate = myObj.nextLine();  // Read user input
        int day = Integer.parseInt(strDate);

        Date dateNow = new Date();
        System.out.println(dateNow);
        Date date = new GregorianCalendar(year, month -1, day).getTime();
        System.out.println(date);
        int difference = (int) ChronoUnit.DAYS.between( date.toInstant(), dateNow.toInstant());
        int userAge = difference / 365;

        if(16 > userAge){
            System.out.println("The age of the applicant is " + userAge + " which is too early to apply for a driving license");
        }

    }
}
