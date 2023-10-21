package CoffeeIngredientFactory;

import CoffeeIngredient.Beans;
import CoffeeIngredient.CowMilk;
import CoffeeIngredient.FrenchBeans;
import CoffeeIngredient.Milk;

public class RobustaIngredientFactory implements CoffeeIngredientAbstractFactory
{
  @Override
  public Beans getBeans()
  {
    return new FrenchBeans();
  }

  @Override
  public Milk getMilk()
  {
    return new CowMilk();
  }
}
