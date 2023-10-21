import Coffee.Coffee;
import CoffeeFactory.AbstractCoffeeFactory;

public class CoffeeServer
{
  AbstractCoffeeFactory coffeeFactory;

  public CoffeeServer(AbstractCoffeeFactory coffeeFactory) {
    this.coffeeFactory = coffeeFactory;
  }

  public Coffee serve(String coffeeType) {
    return coffeeFactory.getCoffee(coffeeType);
  }
}
