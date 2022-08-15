public class Product {

    private Vegetable product1 = null;
    private Grocery product2 = null;
    private Fruits product3 = null;

    private final double quantity;

    public Product(Vegetable product, double quantity){
        this.product1 = product;
        this.quantity = quantity;
    }
    public Product(Grocery product, double quantity){
        this.product2 = product;
        this.quantity = quantity;
    }
    public Product(Fruits product, double quantity){
        this.product3 = product;
        this.quantity = quantity;
    }
    public double cost() {
        if(product1!=null) return product1.costOf(product1)*quantity;
        if(product2!=null) return product2.costOf(product2)*quantity;
        if(product3!=null) return product3.costOf(product3)*quantity;
        return 0.0;
    }
}
