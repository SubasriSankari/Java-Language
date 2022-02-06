import java.util.*;

public class SpeedFind{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Distance in meters:");
        Float dist = sc.nextFloat();
        System.out.println("Enter the Time in hour:");
        Integer hour = sc.nextInt();
        System.out.println("Enter the Time in minute:");
        Integer minute = sc.nextInt();
        System.out.println("Enter the Time in seconds:");
        Integer second = sc.nextInt();

        Integer timeInSeconds = (hour * 3600) + (minute * 60) + second;
        Float meterPerSecond = dist / timeInSeconds;
        Float kilometerPerHour = (dist / 1000.0f) / (timeInSeconds/3600.0f);
        Float milesPerHour = kilometerPerHour / 1.609f;

        System.out.println("Speed in mps is " + meterPerSecond);        
        System.out.println("Speed in kph is " + kilometerPerHour);
        System.out.println("Speed in mph is " + milesPerHour);
    }
}