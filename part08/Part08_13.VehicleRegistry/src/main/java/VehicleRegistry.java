import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class VehicleRegistry {
    private HashMap<String, LicensePlate> vehicleRegistry;

    public VehicleRegistry() {
        this.vehicleRegistry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        boolean isThere = false;
        if (vehicleRegistry.containsKey(owner)) {
            if (vehicleRegistry.get(owner).equals(licensePlate)) {
                isThere = false;
            } else {
                this.vehicleRegistry.put(owner + " ", licensePlate);
                isThere = true;
            }
        } else if (!vehicleRegistry.containsKey(owner)) {
            if (this.vehicleRegistry.values().stream().anyMatch(x -> x.equals(licensePlate))) {
                this.vehicleRegistry.put(owner, licensePlate);
                isThere = false;
            } else {
                this.vehicleRegistry.put(owner, licensePlate);
                isThere = true;
            }
        }
        return isThere;
    }

    public String get(LicensePlate licensePlate) {
        for (String l : this.vehicleRegistry.keySet()) {
            if (this.vehicleRegistry.get(l).equals(licensePlate)) {
                return l.trim();
            }
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        for (String l : this.vehicleRegistry.keySet()) {
            if (this.vehicleRegistry.get(l).equals(licensePlate)) {
                this.vehicleRegistry.remove(l);
                return true;
            }
        }
        return false;
    }

    public void printLicensePlates() {
        for (String l : this.vehicleRegistry.keySet()) {
            System.out.println(this.vehicleRegistry.get(l));
        }
    }

    public void printOwners() {
        LinkedHashSet<String> newSet = new LinkedHashSet<>();
        for (String l : this.vehicleRegistry.keySet()) {
            newSet.add(l.trim());
        }
        for (String l : newSet) {
            System.out.println(l);
        }
    }

    public void search(LicensePlate licensePlate) {
        get(licensePlate);
    }
}
