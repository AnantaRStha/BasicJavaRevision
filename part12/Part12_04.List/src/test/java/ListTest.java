
import fi.helsinki.cs.tmc.edutestutils.Points;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

@Points("12-04.1 12-04.2")
public class ListTest {

    @Test
    public void noTests() {
        List<String> list = new List<>();
        list.add("test1");
        list.add("test2");
        assertTrue(list.size()==2);
    }

    @Test
    public void valueTests() {
        List<String> list = new List<>();
        list.add("test1");
        list.add("test2");
        assertTrue(list.contains("test2"));
    }

    @Test
    public void removeTests() {
        List<String> list = new List<>();
        list.add("test1");
        list.add("test2");
        list.remove("test1");
        assertFalse(list.contains("test1"));
    }


}
