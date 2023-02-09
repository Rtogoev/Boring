import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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