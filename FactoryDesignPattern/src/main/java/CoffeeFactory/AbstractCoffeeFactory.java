package CoffeeFactory;

import Coffee.Coffee;

public interface AbstractCoffeeFactory
{
  Coffee getCoffee(String coffeeType);
}
