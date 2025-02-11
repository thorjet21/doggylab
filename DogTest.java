// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


import com.sun.source.util.SourcePositions;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

// I just made a change
public class DogTest
{
    public static void main(String[] args)
    {
	    Dog dog = new Dog("Spike");
        Yorkshire yorkshire = new Yorkshire("Yorkshire",50);
	    System.out.println(dog.getName() + " says " + dog.bark());
        //3a bc labrador exstends dog so it inharits all of the dog mathods
        System.out.println(dog.getName() + " says " + dog.bark());
        //5a bc its a sub class of dog so its
        System.out.println(yorkshire.getName() + " says " + dog.bark());
        ((Yorkshire)yorkshire).waddle();
	

    }
}
