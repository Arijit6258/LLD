package InsertStrategy;

import java.util.Collections;
import java.util.List;

public class OrderedInsertStrategy implements InsertStrategy
{
  @Override
  public void insert(List<Integer> numberList, Integer num) {
    System.out.println("ordered inserter called!!");
    numberList.add(num);
    Collections.sort(numberList);
  }
}