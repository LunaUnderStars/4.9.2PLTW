public class Feline extends Animal {

    public Feline() {}

    public Feline(String food, boolean isNocturnal, double aveLifeSpan) {
        super(food, isNocturnal, aveLifeSpan);
        System.out.println("A feline arrives.");
    }

    public void growl() {
        System.out.println("The feline growls.");
    }

    public void roar() {
        System.out.println("The feline roars.");
    }
}
