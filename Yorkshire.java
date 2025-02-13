// ****************************************************************
// Yorkshire.java
//
// A class derived from Dog that holds information about
// a Yorkshire terrier. Overrides Dog speak method.
//          
// ****************************************************************


public class Yorkshire extends Dog {
    protected int size;

    public Yorkshire(String name, int size) {
        super(name);
        this.size = size;
    }

    public void waddle() {
        System.out.println(name + " is doing a York waddle");
    }
}
