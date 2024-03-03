package dev.lpa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Doesn't cmpl bc abstract
//        Animal animal = new Animal("animal", "big", 100);

        Dog dog = new Dog ("Wolf", "big", 100);
//        dog.makeNoise();

        // Method expects Animal but we can pass in Dog
//        doAnimalStuff(dog);


        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Sh", "big", 150));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Fish("Barracuda", "big", 75));
        animals.add(new Dog("Pug", "small", 20));


        for (Animal animal : animals){
            doAnimalStuff(animal);
        }

    }

    // We can't create an animal, but we can still use that type in declarations, lists etc
    // It'll just have to be one of the subclasses
    private static void doAnimalStuff ( Animal animal ){
        animal.makeNoise();
        animal.move("slow");
    }
}