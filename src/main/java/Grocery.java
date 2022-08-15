public enum Grocery {
    pulses(50.0),
    rice(34.5);

    private final double price;

    Grocery(double price){
        this.price = price;
    }
    public double costOf(Grocery product){
        return product.price;
    }

}
