package com.company;

public class Animal {
    String species;
    Double weight;
    Integer age;
    String name;
    Boolean isAlive;

    public Animal(){
        this.isAlive = true;
        this.age = 1;
        this.species = species;

        switch (this.species) {
            case "felis":this.weight = 2.0; break;
            case "canis":this.weight = 10.0; break;
            default: this.weight = 5.0; break;

        }
    }

    public Double getWeight(){
        return this.weight;
    }

    void feed() {
        if (weight <= 0.0) {
            System.out.println("za późno");
        } else {
            weight += 1.0;
            System.out.println("thx for food");
        }
    }
    void takeForAWalk() {
        if(weight <= 0.0){
            System.out.println("jesteś martwy");
        } else
        weight -= 1.0;
        System.out.println("nice walk");

    }
}