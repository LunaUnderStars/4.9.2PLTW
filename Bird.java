public class Bird extends Animal {
    public Bird() {}

    public Bird(String food, boolean isNocturnal, double aveLifeSpan) {
        super(food, isNocturnal, aveLifeSpan);
      }

    public void speak() {
      System.out.println("bird noise");
    }
}
