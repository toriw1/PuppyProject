package edu.guilford;

public class Puppy {
    
    //attributes
    private String name;
    private int age;
    private String breed;
    private String color;
    private String furtype;
    private double weight;
    private boolean spots;
    private boolean female;

    //constructor
    public Puppy (String name, int age, String breed, String color, String furtype, double weight, boolean spots, boolean female) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.furtype = furtype;
        this.weight = weight;
        this.spots = spots;
        this.female = female;
    }

    public Puppy () {
        
    }


    //getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getBreed() {
        return breed;
    }
    public String getColor() {
        return color;
    }
    public String getFurtype() {
        return furtype;
    }
    public double getWeight() {
        return weight;
    }
    public boolean isSpots() {
        return spots;
    }
    public boolean isFemale() {
        return female;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setFurtype(String furtype) {
        this.furtype = furtype;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setSpots(boolean spots) {
        this.spots = spots;
    }
    public void setFemale(boolean female) {
        this.spots = female;
    }


    //methods
    public void bark() {
        System.out.println("Woof!");
    }
    public void eat() {
        System.out.println("Yum!");
    }
    public void cuddle() {
        System.out.println("Pet me!");
    }

}
