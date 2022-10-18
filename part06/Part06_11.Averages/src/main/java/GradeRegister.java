
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> point;

    public GradeRegister() {
        this.point = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.point.add(points);
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        if (!this.grades.isEmpty()) {
            return (this.grades.stream().mapToInt(s -> s).sum() * 1.0 / this.grades.size());
        } else {
            return -1;
        }
    }

    public double averageOfPoints() {
        if (!this.point.isEmpty()) {
            return (this.point.stream().mapToInt(s -> s).sum() * 1.0 / this.point.size());
        } else {
            return -1;
        }
    }

}
