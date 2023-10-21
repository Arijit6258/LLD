package SearchStrategy;

import java.util.List;
import java.util.Objects;

public class LinearSearch implements SearchStrategy
{
  @Override
  public Integer search(List<Integer> numberList, Integer key)
  {
    System.out.println("Linear Searching !!");
    for (int pos = 0; pos < numberList.size(); pos++) {
      if (Objects.equals(numberList.get(pos), key)) return pos;
    }

    return null;
  }
}
