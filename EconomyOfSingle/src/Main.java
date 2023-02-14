import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("mode 1 - money, days");
        System.out.println("mode 2 - money, end-date");
        System.out.println("mode 3 - 0000000000000");
        System.out.println();
        System.out.println("choose mode:");
        switch (scanner.nextLine()) {
            case "1" -> mode1(scanner);
            case "2" -> mode2(scanner);
            case "3" -> mode3(scanner);
        }
    }

    private static void mode3(Scanner scanner) {

    }

    private static void mode2(Scanner scanner) {
        System.out.println("input your money: ");
        int money = scanner.nextInt();
        System.out.println("input end date (yyyy-MM-dd): ");
        LocalDate endDate = LocalDate.parse(scanner.next());
        int daysToSurvive = Period.between(LocalDate.now(), endDate).getDays();
        int moneyPerDay = money / daysToSurvive;
        System.out.println("money per day: " + moneyPerDay);
        System.out.println("Start day: " + LocalDate.now());
        System.out.println("End day: " + LocalDate.now().plusDays(daysToSurvive));
    }

    public static void mode1(Scanner scanner) {
        System.out.println("input your money: ");
        int money = scanner.nextInt();
        System.out.println("input number of days to survive: ");
        int daysToSurvive = scanner.nextInt();
        int moneyPerDay = money / daysToSurvive;
        System.out.println("money per day: " + moneyPerDay);
        System.out.println("Start day: " + LocalDate.now());
        System.out.println("End day: " + LocalDate.now().plusDays(daysToSurvive));
    }
}