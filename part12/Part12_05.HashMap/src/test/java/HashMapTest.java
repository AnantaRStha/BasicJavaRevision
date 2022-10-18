
import fi.helsinki.cs.tmc.edutestutils.Points;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@Points("12-05.1 12-05.2 12-05.3")
public class HashMapTest {

    @Test
    public void noTests() {
    HashMap<String, String > hashMap = new HashMap<>();
    hashMap.add("a","1");
    assertTrue(hashMap.get("a").equals("1"));
    }

    @Test
    public void sizeTests() {
        HashMap<String, String > hashMap = new HashMap<>();
        hashMap.add("a","1");
        hashMap.add("b","2");
        hashMap.remove("a");
        assertFalse(hashMap.get("b").equals("1"));
    }
    @Test
    public void addTests() {
        HashMap<String, String > hashMap = new HashMap<>();
        hashMap.add("a","1");
        hashMap.add("c","3");
        assertTrue(hashMap.get("c").equals("3"));
    }


}
