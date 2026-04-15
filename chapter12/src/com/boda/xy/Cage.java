package com.boda.xy;

import java.util.HashSet;
class Animal { }
class Lion extends Animal{}
class Bird extends Animal{}

public class Cage <E> extends HashSet<E>{
    public static void main(String[]args){
        Animal animal = new Animal();
        Lion king = new Lion();
        Bird sparrow = new Bird();
        Cage<Lion> lionCage = new Cage<Lion>();
        Cage<Bird> birdCage = new Cage<Bird>();
        lionCage.add(king);
        birdCage.add(sparrow);
        // lionCage.add(animal);
        Cage<Animal> someCage = new Cage<>();
        someCage.add(king);
        someCage.add(sparrow);
        for (Animal obj : someCage) {
            System.out.println(obj);
        }
    }
}
