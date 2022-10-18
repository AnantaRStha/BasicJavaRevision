import java.util.ArrayList;
import java.util.Map;

public class ExerciseManagement {

    private ArrayList<Exercise> exercise;

    public ExerciseManagement() {
        this.exercise = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise e : exercise) {
            list.add(e.getName());
        }
        return list;
    }

    public void add(String test) {
        this.exercise.add(new Exercise(test));
    }

    public void markAsCompleted(String exercise) {
        for (Exercise e : this.exercise) {
            if (e.getName().equals(exercise)) {
                e.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exercise) {
        for (Exercise e : this.exercise) {
            if (e.getName().equals(exercise)) {
                return e.isCompleted();
            }
        }
        return false;
    }

}
