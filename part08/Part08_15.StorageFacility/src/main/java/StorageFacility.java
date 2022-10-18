import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageFacility;

    public StorageFacility() {
        this.storageFacility = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storageFacility.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> storage = this.storageFacility.get(unit);
        storage.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> list = new ArrayList<>();
        if (Objects.nonNull(this.storageFacility.get(storageUnit))) {
            list = this.storageFacility.get(storageUnit);
        }
        return list;
    }

    public void remove(String unit, String item) {
        this.storageFacility.get(unit).remove(item);
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> list = new ArrayList<>();
        for (String key : this.storageFacility.keySet()) {
            if (!this.storageFacility.get(key).isEmpty()) {
                list.add(key);
            }
        }
        return list;
    }
}
