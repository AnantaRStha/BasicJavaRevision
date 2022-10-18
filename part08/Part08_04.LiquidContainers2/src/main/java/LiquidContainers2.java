
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container first = new Container();
        Container second = new Container();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            String input = scan.nextLine();
            String command = input.split(" ")[0];
            if (input.equals("quit")) {
                break;
            } else if (command.equals("add")) {
                String[] added = input.split(" ");
                first.add(Integer.valueOf(added[1]));
            } else if (command.equals("remove")) {
                String[] removed = input.split(" ");
                second.remove(Integer.valueOf(removed[1]));
            } else if (command.equals("move")) {
                String[] moved = input.split(" ");
                if (Integer.valueOf(moved[1]) > 0) {
                    if (Integer.valueOf(moved[1]) <= first.getAmount()) {
                        first.setAmount(first.getAmount() - Integer.valueOf(moved[1]));
                        if (second.getAmount() + Integer.valueOf(moved[1]) <= 100) {
                            second.setAmount(second.getAmount() + Integer.valueOf(moved[1]));
                        } else {
                            second.setAmount(100);
                        }
                    } else {
                        if (second.getAmount() + first.getAmount() <= 100) {
                            second.setAmount(second.getAmount() + first.getAmount());
                        } else {
                            second.setAmount(100);
                        }
                        first.setAmount(0);
                    }
                }

            }
        }
    }
}
