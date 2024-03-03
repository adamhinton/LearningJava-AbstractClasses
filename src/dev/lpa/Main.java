package dev.lpa;

public class Main {
    public static void main(String[] args) {

        // Doesn't cmpl bc abstract
//        Animal animal = new Animal("animal", "big", 100);

        Dog dog = new Dog ("Wolf", "big", 100);
        dog.makeNoise();

        // Method expects Animal but we can pass in Dog
        doAnimalStuff(dog);

    }

    // We can't create an animal, but we can still use that type in declarations, lists etc
    // It'll just have to be one of the subclasses
    private static void doAnimalStuff ( Animal animal ){
        animal.makeNoise();
        animal.move("slow");
    }
}