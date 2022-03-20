package Java.Assignments.Day11.Problem2;

import java.util.Comparator;

public class PoductsIdComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getProductId()-p2.getProductId();
    }
}
