import java.util.Arrays;

public class DailyNeedUser {
    public static void main(String[] args){
        DailyNeed products = new DailyNeed(Arrays.asList(new Product(Vegetable.onion ,0.5),
                                        new Product(Fruits.apple, 1),
                                        new Product(Grocery.rice, 3)));

        double totalPrice = products.totalPrice();
        System.out.println("Total Price of products: " + totalPrice);
    }
}
