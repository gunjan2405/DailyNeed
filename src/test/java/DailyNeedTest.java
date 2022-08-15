
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

}
