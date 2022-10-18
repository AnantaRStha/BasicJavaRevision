import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> status;

    public ChangeHistory() {
        this.status = new ArrayList<>();
    }

    public void add(double status) {
        this.status.add(status);
    }

    public void clear() {
        this.status.clear();
    }

    public String toString() {
        String s = "";
        for (Double d : this.status) {
            if (!s.equals("")) {
                s = s + ", " + d;
            } else {
                s = d.toString();
            }
        }
        return "[" + s + "]";
    }

    public double maxValue() {
        if (!this.status.isEmpty()) {
            return this.status.stream().max(Double::compareTo).get();
        } else {
            return 0;
        }
    }

    public double minValue() {
        if (!this.status.isEmpty()) {
            return this.status.stream().min(Double::compareTo).get();
        } else {
            return 0;
        }
    }

    public double average() {
        Double sum = 0.0;
        if (!this.status.isEmpty()) {
            for (Double d : this.status) {
                sum = sum + d;
            }
            sum = sum / this.status.size();
        }
        return sum;

    }
}
