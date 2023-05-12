public class Tiger extends Feline {

    public Tiger() {}

    public Tiger(String food, boolean isNocturnal, double aveLifeSpan) {
        super(food, isNocturnal, aveLifeSpan);
    }

    public void swim() {
        System.out.println("The tiger swims.");
    }
    public void huntAlone() {
        System.out.println("The tiger hunts alone.");
    }
}
