import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ExerciseManagementTest {
    private ExerciseManagement exerciseManagement;

    @Before
    public void setup() {
        exerciseManagement = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {

        assertEquals(0, exerciseManagement.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        exerciseManagement.add("test");
        assertEquals(1, exerciseManagement.exerciseList().size());

    }

    @Test
    public void addedExerciseIsInList() {
        exerciseManagement.add("test");
        assertTrue(exerciseManagement.exerciseList().contains("test"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        exerciseManagement.add("New exercise");
        exerciseManagement.markAsCompleted("New exercise");
        assertTrue(exerciseManagement.isCompleted("New exercise"));
    }
}
