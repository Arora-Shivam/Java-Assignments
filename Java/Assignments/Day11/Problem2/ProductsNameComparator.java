package Java.Assignments.Day11.Problem2;

import java.util.Comparator;

public class ProductsNameComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        if(p1.getProductName().equals(p2.getProductName())){
            return 1;
        }
        return p1.getProductName().compareTo(p2.getProductName());

    }
}
