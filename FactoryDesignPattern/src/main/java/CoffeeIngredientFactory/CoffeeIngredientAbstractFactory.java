package CoffeeIngredientFactory;

import CoffeeIngredient.Beans;
import CoffeeIngredient.Milk;

public interface CoffeeIngredientAbstractFactory
{
  Beans getBeans();
  Milk getMilk();
}
