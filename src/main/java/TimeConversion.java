import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {

        //Input - Given a time in 12-hour AM/PM format
        //Ex. Input - 07:05:45PM -> Output - 19:05:45
        System.out.println("Convert to Military Time!");
        System.out.println("Enter Time in the format - hh:mm:ssAM/PM");
        Scanner scanner = new Scanner(System.in);
        String militaryTime;
        String inputTime = scanner.next();

        //Output - Military time (24-hour format)
        militaryTime = timeConversion(inputTime);

        System.out.println(militaryTime);
    }

    public static String timeConversion(String s) {
        //Split string apart at each (:)

        String[] time;
        int hour;
        time = s.split(":|AM|PM");

        if (s.contains("AM")) {
            if (time[0].equals("12")) {
                time[0] = "00";
            }

            return convertToMilitaryTime(time);
        } else if (s.contains("PM")) {
            if (!time[0].equals("12")) {
                hour = Integer.parseInt(time[0]) + 12;
                time[0] = String.valueOf(hour);
            }

            return convertToMilitaryTime(time);
        } else {
            return "Time not formatted correctly";
        }
    }

    public static String convertToMilitaryTime(String[] timeToConvert) {
        return timeToConvert[0] + ":" + timeToConvert[1] + ":" + timeToConvert[2];
    }
}
