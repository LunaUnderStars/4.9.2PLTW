public class Owl extends Bird{
    public Owl() {}

    public Owl(String food, boolean isNocturnal, double aveLifeSpan) {
        super(food, isNocturnal, aveLifeSpan);
      }    

    public void hunt() {
        System.out.println("The owl hunts.");
    }

    public void speak() {
        System.out.println("owl noise");
    }
}
