package dev.lpa;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")){
            System.out.println(type + "lazily");
        }
        else{
            System.out.println(type + "darting frantically!");
        }
    }

    @Override
    public void makeNoise() {
        if (type == "Golfish"){
            System.out.println("swish");
        }
        else {
            System.out.println("splash");
        }
    }
}
