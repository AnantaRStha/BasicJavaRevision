import java.util.Objects;

public class Item {
    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.qty * this.unitPrice;
    }

    public void increaseQuantity() {
        this.qty = this.qty + 1;
    }

    public String toString() {
        return this.product + ": " + this.qty;
    }

    public String getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    @Override
    public boolean equals(Object o) {
        Item item = (Item) o;
        return this.product.equals(item.product);
    }
}
