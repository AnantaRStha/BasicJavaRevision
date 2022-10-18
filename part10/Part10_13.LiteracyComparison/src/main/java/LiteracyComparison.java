
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class LiteracyComparison {

    public static void main(String[] args) {
//        try {
//            ArrayList<String[]> newList = Files.lines(Paths.get("literacy.csv")).map(x -> x.split(",")).filter(x -> x.length >= 5).sorted((x1, x2) -> (int) (Double.valueOf(x2[5]) - Double.valueOf(x1[5]))).collect(Collectors.toCollection(ArrayList<String[]>::new));
//            Collections.reverse(newList);
//            newList.forEach(x -> System.out.println(x[3] + " ("
//                    + x[4] + "), " + x[2].trim().split(" ")[0] + ", " + x[5]));
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        ArrayList<Literacy> literacyList = new ArrayList<>();
        try{
            Files.lines(Paths.get("literacy.csv")).map(x -> x.split(",")).filter(x -> x.length >= 5).forEach(x-> literacyList.add(new Literacy(x[3],Integer.valueOf(x[4]),x[2].trim().split(" ")[0],Double.valueOf(x[5]))));
            literacyList.sort((x,y)-> x.compareTo(y));
            Collections.reverse(literacyList);
            literacyList.stream().forEach(x-> System.out.println(x));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
