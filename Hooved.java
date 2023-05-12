/*
 * Activity 4.9.2
 */
public class Hooved extends Animal
{
  public Hooved() {}

  public Hooved(String food, boolean isNocturnal, double aveLifeSpan) {
    super(food, isNocturnal, aveLifeSpan);
  }

  public void forage()
  {
    System.out.println("The hooved animal forages for food.");
  }
}