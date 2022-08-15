public enum Vegetable {
    onion(20.0),
    tomato(30.0);

    private final double price;

    Vegetable(double price){
        this.price = price;
    }
    public double costOf(Vegetable product){
        return product.price;
    }
}
