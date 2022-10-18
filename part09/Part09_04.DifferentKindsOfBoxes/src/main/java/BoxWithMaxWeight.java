import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> list;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.list = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() >= 0) {
            if (item.getWeight() <= this.capacity) {
                this.capacity = this.capacity - item.getWeight();
                this.list.add(item);
            }
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (!this.list.isEmpty()) {
            return this.list.stream().anyMatch(x -> x.getName().equals(item.getName()));
        }
        return false;
    }
}
