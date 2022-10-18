
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdWatch birdWatch = new BirdWatch();
        while (true) {
            System.out.print("?");
            String input = scan.nextLine();
            if (input.equals("Quit")) {
                break;
            }
            if (input.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                birdWatch.add(name, latinName);
            } else if (input.equals("Observation")) {
                System.out.print("Bird?");
                String bird = scan.nextLine();
                birdWatch.observation(bird);
            } else if (input.equals("All")) {
                birdWatch.all();
            } else if (input.equals("One")) {
                System.out.println("Bird? ");
                String oneBird = scan.nextLine();
                birdWatch.one(oneBird);
            }
        }

    }

}
