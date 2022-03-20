package Java.Assignments.Day11.Problem2;

import java.util.Comparator;

public class ProductsPriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
      if(p1.getProductPrice()>p2.getProductPrice()){
          return 1;
      }
      return -1;
    };
}
