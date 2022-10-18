
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            list.add(input);
        }
//        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String yOrN = scanner.nextLine();
        if (yOrN.equals("n")) {
            System.out.println("Average of the negative number: " +
                    list.stream().mapToInt(x -> Integer.valueOf(x)).filter(x -> (x < 0)).average().getAsDouble());
        } else if (yOrN.equals("p")) {
            System.out.println("Average of the positive numbers: " +
                    list.stream().mapToInt(x -> Integer.valueOf(x)).filter(x -> x >= 0).average().getAsDouble());
        }
    }
}
