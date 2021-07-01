package com.PracticeCliff;

import java.util.List;

public class DayCare {
    public static void addAnimal(Animal animal, List<Animal> animalList){
        animalList.add(animal);
    }

    public static void displayAnimals(List<Animal> animals){
        for (Animal animal : animals) {
            System.out.println(animal.name + "has" + animal.legs + " legs" + " and weighs" + animal.weight + "lbs" );
        }
    }

    public static void removeAnimal(List<Animal> animals, String name) {
        //oneLiner removeIf method
        animals.removeIf(animal -> animal.name.equals(name));

        //For loop method -> can remove first instance or all instances
        // for ( int i = 0; i < animals.size(); i++) {
        //     if(animals.get(i).name.equals(name)){
        //     animals.remove(i--);
        // }

    }
}
