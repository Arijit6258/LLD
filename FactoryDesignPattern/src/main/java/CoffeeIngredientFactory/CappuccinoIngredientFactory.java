package CoffeeIngredientFactory;

import CoffeeIngredient.AmericanBeans;
import CoffeeIngredient.Beans;
import CoffeeIngredient.CowMilk;
import CoffeeIngredient.Milk;

public class CappuccinoIngredientFactory implements CoffeeIngredientAbstractFactory
{
  @Override
  public Beans getBeans()
  {
    return new AmericanBeans();
  }

  @Override
  public Milk getMilk()
  {
    return new CowMilk();
  }
}
