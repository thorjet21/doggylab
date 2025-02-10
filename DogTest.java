// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


import javax.swing.plaf.synth.SynthOptionPaneUI;
// I just made a change
public class DogTest
{
    public static void main(String[] args)
    {
	    Dog dog = new Dog("Spike");
        Dog Yorkshire = new Dog("Yorkshire");
	    System.out.println(dog.getName() + " says " + dog.bark());
        //3a bc labrador exstends dog so it inharits all of the dog mathods
        System.out.println(dog.getName() + " says " + dog.bark());
        //5a bc its a sub class of dog so its
        System.out.println(Yorkshire.getName() + " says " + dog.bark());
	

    }
}
