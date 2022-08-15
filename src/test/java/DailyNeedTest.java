
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DailyNeedTest {

   @Test
    void shouldEquateToPriceEightyRupeesFor1kgOnionAnd2kgTomato(){
        DailyNeed products = new DailyNeed(Arrays.asList(new Product(Vegetable.onion ,1),
                                                    new Product(Vegetable.tomato ,2)));

        double totalPrice = products.totalPrice();

        assertEquals(80,totalPrice);

    }

    @Test
    void shouldEquateToPriceFiveHundredFortyRupeesFor1kgKiwi2kgAppleAnd3kgTomato(){
        DailyNeed products = new DailyNeed(Arrays.asList(new Product(Fruits.kiwi ,1),
                new Product(Fruits.apple ,2), new Product(Vegetable.tomato ,3)));

        double totalPrice = products.totalPrice();

        assertEquals(540,totalPrice);

    }

}
