public enum AmountOfIngredient {
    GRAM(1),
    MILILITR(1),
    SZTUKA(1);

    private double amount;

    public double getAmount() {
        return amount;
    }

    AmountOfIngredient(double amount) {
        this.amount = amount;
    }
}
