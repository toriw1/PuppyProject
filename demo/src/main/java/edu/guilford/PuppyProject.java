package edu.guilford;

/**
 * Hello world!
 *
 */
public class PuppyProject 
{
    public static void main( String[] args ){
    
    //instantiate a Puppy object
    Puppy myPuppy = new Puppy();

    System.out.println("My Puppy's Attributes: ");

    //set the attributes of the Puppy object
    myPuppy.setName("Lucky");
    myPuppy.setAge(2);
    myPuppy.setBreed("Pomeranian");
    myPuppy.setColor("Black");
    myPuppy.setFurtype("Short");
    myPuppy.setWeight(5.0);
    myPuppy.setSpots(false);
    myPuppy.setFemale(true);

    //print the attributes of the Puppy object
    System.out.println("Name: " + myPuppy.getName());
    System.out.println("Age: " + myPuppy.getAge());
    System.out.println("Breed: " + myPuppy.getBreed());
    System.out.println("Color: " + myPuppy.getColor());
    System.out.println("Fur Type: " + myPuppy.getFurtype());
    System.out.println("Weight: " + myPuppy.getWeight());
    System.out.println("Spots: " + myPuppy.isSpots());
    System.out.println("Female: " + myPuppy.isFemale());

    //call the bark method
    myPuppy.bark();

    //call the cuddle method
    myPuppy.cuddle();

    //call the eat method
    myPuppy.eat();

    }
}
