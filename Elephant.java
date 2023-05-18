public class Elephant extends Animal {

    public Elephant() {}
    public Elephant(String food, boolean nocturnal, double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A new Elephant has arrived at the zoo!");
    }
    
    public void trumpet() {
    System.out.println("The elephant trumpets.");
    }

    public void speak() {
        System.out.println("elephant noise");
    }

    public String toString()
    {
    return "This is an object of the Elephant class.";
    }
}
