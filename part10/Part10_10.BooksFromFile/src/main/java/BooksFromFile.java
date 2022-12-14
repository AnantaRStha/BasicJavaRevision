
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Book> readBooks(String file) {
        ArrayList<Book> bookList = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).map(x -> x.split(",")).filter(x -> x.length >= 4)
                    .forEach(x -> bookList.add(new Book(x[0], Integer.valueOf(x[1]), Integer.valueOf(x[2]), x[3])));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return bookList;
    }

}
