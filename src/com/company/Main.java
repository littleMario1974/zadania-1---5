package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.species = "canis";
        dog.isAlive = true;
        dog.name = "Szarik";
        dog.weight = 10.0;

        System.out.println("species: " + dog.species + " name: " + dog.name);

        Animal cat = new Animal();
        cat.species = "felis";
        cat.isAlive = true;
        cat.name = "Sierściuch";

        Human kacper = new Human();
        kacper.firstName = "Kacper";
        kacper.lastName = "Warda";
        kacper.pet = dog;
        kacper.mobile = new Phone();
        kacper.mobile.producer = "apple";
        kacper.pet.feed();

   Car fiat = new Car("bravo","fiat");
   Car pasat = new Car ("passat", "vw");
    }

}

