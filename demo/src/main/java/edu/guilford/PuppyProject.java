package edu.guilford;

import java.text.DecimalFormat;

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
    myPuppy.setSize("Small");
    myPuppy.setWeight(5.0);
    myPuppy.setSpots(false);
    myPuppy.setSex("Female");

    //print the attributes of the Puppy object
    System.out.println("Name: " + myPuppy.getName());
    System.out.println("Age: " + myPuppy.getAge());
    System.out.println("Breed: " + myPuppy.getBreed());
    System.out.println("Color: " + myPuppy.getColor());
    System.out.println("Fur Type: " + myPuppy.getFurtype());
    System.out.println("Size: " + myPuppy.getSize());
    System.out.println("Weight: " + myPuppy.getWeight());
    System.out.println("Spots: " + myPuppy.isSpots());
    System.out.println("Female: " + myPuppy.getSex());

    //call the bark method
    myPuppy.bark();

    //call the cuddle method
    myPuppy.cuddle();

    //call the eat method
    myPuppy.eat();

    // call the play method
    myPuppy.play();

    //instantiate a random Puppy object
    Puppy randomPuppy = new Puppy();

    //use the constructor to randomly set the attributes of the Puppy object
    DecimalFormat formatter = new DecimalFormat("0.00");
    System.out.println("\nRandom Puppy's Attributes: ");
    System.out.println("Name: " + randomPuppy.getName());
    System.out.println("Age: " + randomPuppy.getAge());
    System.out.println("Breed: " + randomPuppy.getBreed());
    System.out.println("Color: " + randomPuppy.getColor());
    System.out.println("Fur Type: " + randomPuppy.getFurtype());
    System.out.println("Size: " + randomPuppy.getSize());
    System.out.println("Weight: " + formatter.format(randomPuppy.getWeight()));
    System.out.println("Spots: " + randomPuppy.isSpots());
    System.out.println("Female: " + randomPuppy.getSex());


    }
}
