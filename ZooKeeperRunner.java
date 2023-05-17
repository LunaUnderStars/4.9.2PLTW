/*
 * Activity 4.9.2
 */

import java.util.ArrayList;
public class ZooKeeperRunner
{
  public static void main(String[] args) {

    Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    elephant.trumpet(); 
    elephant.eat();
    elephant.isNocturnal();
    elephant.getLifeSpan();

    Tiger tiger = new Tiger("meat", true, 17.0);
    tiger.swim();
    tiger.huntAlone();

    Gorilla gorilla = new Gorilla();

    Giraffe giraffe = new Giraffe("leaves", false, 25.0);
    giraffe.eat();

    Hippo hippo = new Hippo();
    hippo.eat();

    Penguin penguin = new Penguin();
    penguin.fish();
    Owl owl = new Owl();
    owl.hunt();
    Owl owl2 = new Owl("mice,insects", true, 4.0);
    owl2.eat();


    ArrayList<Animal> animalArrayList = new ArrayList<Animal>();

    animalArrayList.add(new Animal());
    animalArrayList.add(new Bird());
    animalArrayList.add(new Deer());
    animalArrayList.add(new Elephant());
    animalArrayList.add(new Feline());
    animalArrayList.add(new Giraffe());
    animalArrayList.add(new Gorilla());
    animalArrayList.add(new Hippo());
    animalArrayList.add(new Hooved());
    animalArrayList.add(new Lion());
    animalArrayList.add(new Monkey());
    animalArrayList.add(new Owl());
    animalArrayList.add(new Penguin());
    animalArrayList.add(new Primate());
    animalArrayList.add(new Tiger());

    for (Animal currentAnimal: animalArrayList) {
      currentAnimal.speak();
    }
    hearTheAnimal(owl2);
    hearTheAnimal(hippo);
    hearTheAnimal(giraffe);
  }



  public static void hearTheAnimal(Animal currentAnimal)
  {
      currentAnimal.speak();
  }
}

