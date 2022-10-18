
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> number = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("-1")) {
                break;
            }
            number.add(input);
        }

        number.stream().mapToInt(x -> Integer.valueOf(x)).filter(x -> (x >= 1 && x <= 5)).forEach(x -> System.out.println(x));


    }
}
