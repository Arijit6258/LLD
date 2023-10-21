import Coffee.Coffee;
import CoffeeFactory.CoffeeFactory;

import java.util.Arrays;
import java.util.List;

public class Tester
{
  public static void main (String[] args) {
    List<String> coffeeTypes = Arrays.asList("espresso", "robusta", "cappuccino");
    for (String coffeeType : coffeeTypes) {
       Coffee coffee = new CoffeeServer(new CoffeeFactory()).serve(coffeeType);
       System.out.print("Type : ");
       coffee.getType();
       System.out.println("\n\n");
    }
  }
}
