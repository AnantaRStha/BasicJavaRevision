
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        Points points = new Points();
        System.out.println("Enter point totals, -1 stops:");
        while (true){
            int input = scanner.nextInt();
            if(input == -1){
                break;
            }
            if(input>=0 && input<=100) {
                points.add(input);
            }
        }
        points.getAverageAll();
        points.getAveragePass();
        points.getPassPercentage();
        GradeDistribution gradeDistribution = new GradeDistribution(points);
        gradeDistribution.distribution();
    }
}
