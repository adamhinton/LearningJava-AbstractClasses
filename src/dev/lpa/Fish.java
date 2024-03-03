package dev.lpa;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")){
            System.out.println(type + "walking");
        }
        else{
            System.out.println(type + "running");
        }
    }

    @Override
    public void makeNoise() {
        if (type == "Wolf"){
            System.out.println("Howl");
        }
        else {
            System.out.println("Woof");
        }
    }
}