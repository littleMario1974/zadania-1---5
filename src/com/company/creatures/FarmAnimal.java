package com.company.creatures;

public class FarmAnimal extends Animal {

    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public String toString() {
        return this.species + " " + this.getWeight();
    }
}