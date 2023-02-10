import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        DayOfTheWeek dayOfTheWeek = DayOfTheWeek.valueOf(soz.toUpperCase());

        DayOfWeek sunday = DayOfWeek.SUNDAY;
        System.out.println(sunday+("учитбся не будем"));
        DayOfWeek monday=DayOfWeek.MONDAY;
        System.out.println(monday+("urok po java"));
        DayOfWeek tuesday=DayOfWeek.TUESDAY;
        System.out.println(tuesday+("prictice lesson"));
        DayOfWeek thursday=DayOfWeek.THURSDAY;
        System.out.println(thursday+("english and java lesson"));
        DayOfWeek wednesday=DayOfWeek.WEDNESDAY;
        System.out.println(wednesday+("prictice lesson"));
        DayOfWeek friday=DayOfWeek.FRIDAY;
        System.out.println(friday+("new theme in java"));
        DayOfWeek saturday=DayOfWeek.SATURDAY;
        System.out.println(saturday+("prictice lesson "));




    }
}