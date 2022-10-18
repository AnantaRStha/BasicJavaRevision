import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    private List<Item> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public void add(String name, int price) {
        if (!this.cart.isEmpty()) {
            if (this.cart.contains(new Item(name, 1, price))) {
                this.cart.stream().filter(x -> x.getProduct().equals(name)).forEach(x -> x.increaseQuantity());
            } else {
                this.cart.add(new Item(name, 1, price));
            }

        } else {
            this.cart.add(new Item(name, 1, price));
        }
    }

    public int price() {
        return this.cart.stream().mapToInt(x -> x.price()).sum();
    }

    public void print() {
        this.cart.stream().forEach(x -> System.out.println(x.toString()));
    }
}
