import InsertStrategy.OrderedInsertStrategy;
import InsertStrategy.UnorderedInsertStrategy;
import SearchStrategy.BinarySearch;
import SearchStrategy.LinearSearch;

import java.util.Random;

public class Tester
{
  public static void main(String[] args) {
    NumberStore orderedNumberStore = new NumberStore(new OrderedInsertStrategy(), new BinarySearch());
    NumberStore unorderedNumberStore = new NumberStore(new UnorderedInsertStrategy(), new LinearSearch());

    Random random = new Random();
    for (int i = 1; i <= 4; i++) {
      int num = random.nextInt();
      System.out.println(num);
      orderedNumberStore.insert(num);
      unorderedNumberStore.insert(num);
      System.out.println("ordered number store : " + orderedNumberStore.search(num));
      System.out.println("unordered number store : " + unorderedNumberStore.search(num));
    }
  }
}
