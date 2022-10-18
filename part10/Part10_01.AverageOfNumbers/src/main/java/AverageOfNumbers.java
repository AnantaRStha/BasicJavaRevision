
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();
        // Write your program here
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            items.add(input);
        }
        Double average = items.stream().mapToDouble(x -> Integer.valueOf(x)).average().getAsDouble();
        System.out.println("average of the number: " + average);

    }
}
