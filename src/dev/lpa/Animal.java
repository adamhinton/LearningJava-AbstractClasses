package dev.lpa;

// convxn is to have access modifier first
public abstract class Animal {

    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    // final comes after access by default
    public final String getExplicitType(){
        return getClass().getSimpleName() + " (" + type + ")";
    }

    // No fxn body
    // method bodies don't compile
    public abstract void move(String speed);
    public abstract void makeNoise();
}


abstract class Mammal extends Animal{

    // we're not forced to implement move/makenoise methods here. Why not?
    // Abstract can implement all/none/some of parent's abstract methods
    // Can also make more abstract methods
    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        System.out.print(getExplicitType() + " ");
        System.out.println(speed.equals("slow") ? "walks" : "runs");

    }

    public abstract void shedHair();



}