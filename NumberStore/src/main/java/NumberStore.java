import InsertStrategy.InsertStrategy;
import SearchStrategy.SearchStrategy;

import java.util.ArrayList;
import java.util.List;

public class NumberStore
{
  List<Integer> numberList;
  InsertStrategy insertStrategy;
  SearchStrategy searchStrategy;

  public NumberStore(InsertStrategy insertStrategy, SearchStrategy searchStrategy) {
    this.numberList = new ArrayList<>();
    this.insertStrategy = insertStrategy;
    this.searchStrategy = searchStrategy;
  }

  public void insert(int num) {
    insertStrategy.insert(numberList, num);
  }

  public Integer search(int num) {
    return searchStrategy.search(numberList, num);
  }
}
