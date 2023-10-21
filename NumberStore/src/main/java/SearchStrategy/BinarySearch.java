package SearchStrategy;

import java.util.List;
import java.util.Objects;

public class BinarySearch implements SearchStrategy
{
  @Override
  public Integer search(List<Integer> numberList, Integer key)
  {
    System.out.println("Binary searching !!");
    int start = 0, end = numberList.size()-1;
    while(start < end) {
      int mid = start + (end-start+1)/2;
      if (numberList.get(mid) > key) {
        end = mid-1;
      } else {
        start = mid;
      }
    }

    return Objects.equals(numberList.get(start), key) ? start : null;
  }
}
