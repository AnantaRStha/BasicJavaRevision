
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        Recipes recipesSearch = new Recipes(file);
        recipesSearch.readRecipeFile();
        System.out.println("Commands:\n" +
                "list - lists the recipes\n" +
                "stop - stops the program\n" +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient");
        while (true) {
            System.out.println("Enter command:");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            } else if (input.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int max = Integer.valueOf(scanner.nextLine());
                recipesSearch.findByTime(max);
            } else if (input.equals("find name")) {
                System.out.println("Searched word: ");
                String search = scanner.nextLine();
                recipesSearch.findByName(search);
            } else if (input.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                recipesSearch.findByIngredients(ingredient);
            } else if (input.equals("list")) {
                recipesSearch.getRecipesList();
            }
        }


    }

}
