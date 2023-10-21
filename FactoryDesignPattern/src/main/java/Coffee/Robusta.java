package Coffee;

import CoffeeIngredientFactory.CoffeeIngredientAbstractFactory;

public class Robusta implements Coffee
{
  CoffeeIngredientAbstractFactory coffeeIngredientAbstractFactory;

  public Robusta(CoffeeIngredientAbstractFactory coffeeIngredientAbstractFactory) {
    this.coffeeIngredientAbstractFactory = coffeeIngredientAbstractFactory;
  }
  @Override
  public void brew()
  {
    coffeeIngredientAbstractFactory.getBeans();
    coffeeIngredientAbstractFactory.getMilk();
    System.out.println("Robusta brewed!");
  }

  @Override
  public void boil()
  {
    System.out.println("Water boiled for robusta!");
  }

  @Override
  public void getType()
  {
    System.out.println("Robusta");
  }
}
