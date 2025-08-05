package org.studyeasy;

import org.studyeasy.animals.Animal;
import org.studyeasy.animals.bird.Birds;
import org.studyeasy.animals.bird.Eagle;
import org.studyeasy.animals.fish.Eel;
import org.studyeasy.animals.reptiles.Crocodile;
import org.studyeasy.animals.reptiles.Reptiles;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Animal animal = new Animal();
        Reptiles reptiles = new Reptiles();
        Animal crocodile = new Crocodile();
        Animal eel = new Eel();
        Birds eagle = new Eagle();
        animals.add(animal);
        animals.add(reptiles);
        animals.add(crocodile);
        animals.add(eel);
        animals.add(eagle);
        listOfAnimals(animals);
//        System.out.println(animal.showInfo());

    }
    private static void listOfAnimals(List<Animal> animals) {
      for (Animal animal : animals){
          System.out.println(animal.showInfo());
      }
    }
}