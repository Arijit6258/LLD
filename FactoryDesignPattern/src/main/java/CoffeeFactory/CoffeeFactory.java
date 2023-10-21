package CoffeeFactory;

import Coffee.Cappuccino;
import Coffee.Coffee;
import Coffee.Espresso;
import Coffee.Robusta;
import CoffeeIngredientFactory.CappuccinoIngredientFactory;
import CoffeeIngredientFactory.EspressoIngredientFactory;
import CoffeeIngredientFactory.RobustaIngredientFactory;

public class CoffeeFactory
    implements AbstractCoffeeFactory
{
  @Override
  public Coffee getCoffee(String coffeeType) {
    Coffee coffee = switch (coffeeType) {
      case "espresso" -> new Espresso(new EspressoIngredientFactory());
      case "cappuccino" -> new Cappuccino(new CappuccinoIngredientFactory());
      case "robusta" -> new Robusta(new RobustaIngredientFactory());
      default -> null;
    };

    coffee.brew();
    coffee.boil();


    return coffee;
  }
}
