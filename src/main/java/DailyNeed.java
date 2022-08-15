import java.util.List;

public class DailyNeed {
    private double totalPrice;
    List<Product> product;

    public DailyNeed(List<Product> product) {
        this.product = product;
    }
    public double totalPrice(){
        for(Product product: product){
            totalPrice += product.cost();
        }
        return totalPrice;
    }
}
