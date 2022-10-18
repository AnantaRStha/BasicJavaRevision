
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        int sum = 0;
        int sumSecond = 0;
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            String command = input.split(" ")[0];
            if (input.equals("quit")) {
                break;
            } else if (command.equals("add")) {
                String[] added = input.split(" ");
                if (Integer.valueOf(added[1]) > 0) {
                    sum = first + Integer.valueOf(added[1]);
                    if (sum <= 100) {
                        first = sum;
                    } else {
                        first = 100;
                    }
                }
            } else if (command.equals("move")) {
                String[] moved = input.split(" ");
                if (Integer.valueOf(moved[1]) > 0) {
                    if (Integer.valueOf(moved[1]) <= first) {
                        first = first - Integer.valueOf(moved[1]);
                        sumSecond = second + Integer.valueOf(moved[1]);
                        if (sumSecond <= 100) {
                            second = sumSecond;
                        } else {
                            second = 100;
                        }
                    } else {
                        sumSecond = second + first;
                        first = 0;
                        if (sumSecond <= 100) {
                            second = sumSecond;
                        } else {
                            second = 100;
                        }
                    }
                }
            } else if (command.equals("remove")) {
                String[] removed = input.split(" ");
                if (Integer.valueOf(removed[1]) > 0) {
                    if (second >= Integer.valueOf(removed[1])) {
                        second = second - Integer.valueOf(removed[1]);
                    } else {
                        second = 0;
                    }
                }
            }

        }
    }

}
