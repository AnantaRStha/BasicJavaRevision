public class Container {
    private int amount;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (this.amount + amount <= 100) {
                this.amount = this.amount + amount;
            } else {
                this.amount = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (this.amount >= amount) {
                this.amount = this.amount - amount;
            } else {
                this.amount = 0;
            }
        }
    }

    public String toString() {
        return this.amount + "/100";
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
