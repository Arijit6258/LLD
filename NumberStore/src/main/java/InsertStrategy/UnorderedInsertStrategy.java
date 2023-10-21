package InsertStrategy;

import java.util.List;

public class UnorderedInsertStrategy implements  InsertStrategy
{
  @Override
  public void insert(List<Integer> numberList, Integer num)
  {
    System.out.println("unordered inserter called !!");
    numberList.add(num);
  }
}
