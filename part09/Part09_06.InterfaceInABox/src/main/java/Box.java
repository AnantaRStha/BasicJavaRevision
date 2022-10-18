import java.util.ArrayList;

public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> item;

    public Box(double capacity) {
        this.capacity = capacity;
        this.item = new ArrayList<>();
    }

    public void add(Packable packable) {
        if ((packable.weight() + weight()) <= this.capacity) {
            this.item.add(packable);
        }
    }

    @Override
    public double weight() {
        return this.item.stream().mapToDouble(x -> x.weight()).sum();
    }

    @Override
    public String toString() {
        return "Box: " + this.item.size() +
                " items, " + "total weight " + weight() + " kg";
    }
}
