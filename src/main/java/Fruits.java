public enum Fruits {
    apple(200.0),
    kiwi(50.0);

    private final double price;

    Fruits(double price){
        this.price = price;
    }
    public double costOf(Fruits product){
        return product.price;
    }
}
