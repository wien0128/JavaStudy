package thisIsJava.streamEx.sec04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProductMain {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        for (int i = 1; i <= 5; ++i) {
            Product product = new Product(i, "상품" + i, "SomeCompany",
                    (int)(10000*Math.random()));
            list.add(product);
        }

        Stream<Product> stream = list.stream();
        stream.forEach(p -> System.out.println(p));
    }
}
