import java.util.ArrayList;

public class OneItemBox extends Box {

    private ArrayList<Item> list;

    public OneItemBox() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.list.isEmpty()) {
            this.list.add(item);
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
