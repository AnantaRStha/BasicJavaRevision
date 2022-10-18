import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> personLise;

    public IOU() {
        personLise = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.personLise.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.personLise.getOrDefault(toWhom, 0.0);
    }
}
