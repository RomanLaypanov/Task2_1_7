import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        System.out.println(Task2_1_7.Day.isWeekend(day));
        System.out.println(Task2_1_7.Day.getRusName(day));
    }
}