// ****************************************************************
// Dog.java
//
// A class that holds a dog's name and can make it speak.
//          
// ****************************************************************
public class Dog extends Animal {
    protected String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String bark() {
        return "Dog barking";
    }

    public void eat() {
        System.out.println(name + " is eating dog food");
    }
}
