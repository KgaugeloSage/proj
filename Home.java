package com.company;

import java.util.ArrayList;

public class Home extends Animal{
    ArrayList<Animal> petCat = new ArrayList<Animal>();
    ArrayList<Animal> petDog = new ArrayList<Animal>();
    Cat initialCat = new Cat();
    Dog initialDog = new Dog();



    void adoptPet(Cat cat){
        int j = petCat.size();
        for(int i = 0; i <= j;i++){
            if (petCat.size() == 0){
                petCat.add(initialCat);
            }
            if(j == 2){
                i=1;
            }
            if(petCat.get(i) == cat ){
            System.out.println("Can't adopt same pet twice");
            }else{
                cat.sound();
                petCat.add(cat);
            }
        }
    }
    void adoptPet(Dog dog){
        int j = petDog.size();
        petDog.add(initialDog);
        for(int i = 0; i < j ; ++i)
            if(petDog.get(i) == dog){
                System.out.println("Can't adopt same pet twice");
            }else{
                dog.sound();
            }
        petDog.add(dog);
    }
    void makeAllSounds(){

    }
}
