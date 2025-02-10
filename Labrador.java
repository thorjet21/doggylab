// ****************************************************************
// Labrador.java
//
// A class derived from Dog that holds information about
// a labrador retriever.  Overrides Dog speak method and includes
// information about avg weight for this breed.
//          
// ****************************************************************


public class Labrador extends Dog
{
    private String color; //black, yellow, or chocolate?
    
    //we have to identify were name is coming from, so you have to use super to put name from dog
    public Labrador(String name,  String color)
    {
        super(name);
	    this.color = color;
    }

    
    public String bark()
    {
	return "Labrador barking";
    }



}
