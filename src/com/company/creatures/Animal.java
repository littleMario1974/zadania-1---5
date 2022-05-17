package com.company.creatures;

public abstract class Animal implements Feedable {
    private static final Double DEFAULT_DOG_WEIGHT = 9.0;
    static final Double DEFAULT_WEIGHT = 5.0;
    static final Double DEFAULT_CAT_WEIGHT = 2.5;
    private static final Double DEFAULT_FOOD_WEIGHT = 1.0;

    public final String species;
    protected Double weight;
    public Integer age;
    public String name;
    public Boolean isAlive;

    public Animal(String species) {
        this.isAlive = true;
        this.age = 1;
        this.species = species;

        switch (this.species) {
            case "felis":
                this.weight = DEFAULT_CAT_WEIGHT;
                break;
            case "canis":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            default:
                this.weight = DEFAULT_WEIGHT;
                break;
        }
    }

    public Double getWeight() {
        return this.weight;
    }


    public void feed() {
        this.feed(DEFAULT_FOOD_WEIGHT);
    }

    public void feed(Double foodWeight) {
        if (isAlive) {
            weight += foodWeight;
            System.out.println("thx for food");
        } else {
            System.out.println("trochę za późno");
        }
    }

    public void takeForAWalk() {
        if (isAlive) {
            weight -= 1.0;
            System.out.println("nice walk, thx");
            if (weight <= 0.0) {
                isAlive = false;
            }
        } else {
            System.out.println("halo policja, ktoś targa martwe zwierze po chodniku");
        }
    }

    public abstract String toString();
}