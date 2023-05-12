/*
 * Activity 4.9.2
 */
public class Giraffe extends Hooved
{
  public Giraffe(String food, boolean isNocturnal, double aveLifeSpan) {
    super(food, isNocturnal, aveLifeSpan);
  }

  public void hum()
  {
    System.out.println("The giraffe hums.");
  }
}