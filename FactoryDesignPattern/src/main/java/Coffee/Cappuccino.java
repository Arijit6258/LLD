package Coffee;

import CoffeeIngredientFactory.CappuccinoIngredientFactory;

public class Cappuccino implements Coffee
{
  CappuccinoIngredientFactory cappuccinoIngredientFactory;
  public Cappuccino(CappuccinoIngredientFactory cappuccinoIngredientFactory) {
    this.cappuccinoIngredientFactory = cappuccinoIngredientFactory;
  }
  @Override
  public void brew()
  {
    cappuccinoIngredientFactory.getBeans();
    cappuccinoIngredientFactory.getMilk();
    System.out.println("Cappuccino brewed!");
  }

  @Override
  public void boil()
  {
    System.out.println("Water boiled for cappuccino!");
  }

  @Override
  public void getType()
  {
    System.out.println("Cappuccino");
  }
}
