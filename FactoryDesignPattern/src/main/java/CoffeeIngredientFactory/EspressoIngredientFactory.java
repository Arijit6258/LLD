package CoffeeIngredientFactory;

import CoffeeIngredient.Beans;
import CoffeeIngredient.FrenchBeans;
import CoffeeIngredient.Milk;
import CoffeeIngredient.PowderMilk;

public class EspressoIngredientFactory implements CoffeeIngredientAbstractFactory
{
  @Override
  public Beans getBeans()
  {
    return new FrenchBeans();
  }

  @Override
  public Milk getMilk()
  {
    return new PowderMilk();
  }
}
