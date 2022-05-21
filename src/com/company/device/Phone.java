package com.company.device;

import com.company.creatures.Human;

public class Phone extends Device implements Rechargeable {
    public Double screenSize;
    public String os;

    public Phone(String model, String producer, Integer yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("wciskam przycisk");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("o! jest logo, jednak działa");
    }

    @Override
    public void recharge() {
        System.out.println("znajdź ładowarkę");
        System.out.println("znajdź wolne gniazdko");
        System.out.println("podłącz");
        System.out.println("czekaj");
        System.out.println("czekaj nadal");
        System.out.println("czekaj ");
        System.out.println("tak, ciągle czekaj");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}