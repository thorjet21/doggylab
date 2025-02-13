// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


import java.util.ArrayList;

public class DogTest {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Spike");
        dogs[1] = new Yorkshire("Yorkie", 50);
        dogs[2] = new Labrador("Buddy", "Yellow");

        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].getName() + " says " + dogs[i].bark());
        }

        for (Dog d : dogs) {
            System.out.println(d.getName() + " says " + d.bark());
        }

        ((Labrador) dogs[2]).waddle(); // cast bc only lab has waddle

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Dog("Charlie"));
        animalList.add(new Yorkshire("Max", 40));
        animalList.add(new Labrador("Bailey", "Chocolate"));

        for (Animal a : animalList) {
            a.setAge(5);
        }

        for (Animal a : animalList) {
            System.out.println(a.getAge());
            a.eat();
            System.out.println(((Dog) a).bark()); // cast bc only Dog has bark
        }
    }
}
