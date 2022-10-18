public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.setBalance(initialBalance);
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(initialBalance);
    }

    public String history() {
        return this.changeHistory.toString();
    }

    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            super.setBalance(super.getBalance() + amount);
            this.changeHistory.add(super.getBalance());
        } else {
            super.setBalance(super.getCapacity());
            this.changeHistory.add(super.getBalance());
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > super.getBalance()) {
            double allThatWeCan = super.getBalance();
            super.setBalance(0.0);
            this.changeHistory.add(super.getBalance());
            return allThatWeCan;
        }

        super.setBalance(super.getBalance() - amount);
        this.changeHistory.add(super.getBalance());
        return amount;
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName() + "\n" +
                "History: " + this.changeHistory.toString() + "\n" +
                "Largest amount of product: " + this.changeHistory.maxValue() + "\n" +
                "Smallest amount of product: " + this.changeHistory.minValue() + "\n" +
                "Average:" + this.changeHistory.average());

    }
}
