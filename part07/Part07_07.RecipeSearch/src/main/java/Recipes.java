import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recipes {
    private Scanner scanner;
    private String file;
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    ArrayList<List<String>> recipes;


    public Recipes(String file) {
        this.scanner = new Scanner(System.in);
        this.file = file;
        this.ingredients = new ArrayList<>();
        this.recipes = new ArrayList<>();
    }

    public void readRecipeFile() {
        try {
            ArrayList<String> list = new ArrayList<>();
            Scanner scanFile = new Scanner(Paths.get(file));
            while (scanFile.hasNextLine()) {
                String lines = scanFile.nextLine();
                if (lines.equals("")) {
                    ArrayList<String> newList = new ArrayList<>();
                    newList.addAll(list);
                    this.recipes.add(newList);
                    list.clear();
                } else {
                    list.add(lines);
                }
                System.out.println(lines);

            }
            if (!list.isEmpty()) {
                ArrayList<String> newList = new ArrayList<>();
                newList.addAll(list);
                this.recipes.add(newList);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void getRecipesList() {
        System.out.println("Recipes:");
        for (List<String> s : this.recipes) {
            System.out.println(s.get(0) + ", cooking time: " + s.get(1));
        }
    }

    public void findByName(String search) {
        for (List<String> s : this.recipes) {
            if (s.stream().anyMatch(n -> n.contains(search))) {
                System.out.println(s.get(0) + ", cooking time: " + s.get(1));
            }
        }
    }

    public void findByTime(int max) {
        for (List<String> s : this.recipes) {
            if (Integer.valueOf(s.get(1)) <= max) {
                System.out.println(s.get(0) + ", cooking time: " + s.get(1));
            }
        }
    }

    public void findByIngredients(String ingredient) {
        for (List<String> s : this.recipes) {
            if (s.stream().anyMatch(n -> n.equals(ingredient))) {
                System.out.println(s.get(0) + ", cooking time: " + s.get(1));
            }
        }
    }

}
