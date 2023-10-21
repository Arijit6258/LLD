package Coffee;

import CoffeeIngredientFactory.CoffeeIngredientAbstractFactory;

public class Espresso implements Coffee
{
  CoffeeIngredientAbstractFactory coffeeIngredientAbstractFactory;
  public Espresso(CoffeeIngredientAbstractFactory coffeeIngredientAbstractFactory) {
    this.coffeeIngredientAbstractFactory = coffeeIngredientAbstractFactory;
  }
  @Override
  public void brew()
  {
    coffeeIngredientAbstractFactory.getBeans();
    coffeeIngredientAbstractFactory.getMilk();
    System.out.println("Espresso brewed!");
  }

  @Override
  public void boil()
  {
    System.out.println("Water boiled for espresso!");
  }

  @Override
  public void getType()
  {
    System.out.println("Espresso");
  }
}
