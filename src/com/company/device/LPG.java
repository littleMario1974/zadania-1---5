package com.company.device;

public class LPG extends Car {

    public LPG(String model, String producer, Integer yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("podjeżdżam na stację benzynową");
        System.out.println("podłączam wąż do zaworu");
        System.out.println("wciskam przycisk tankowania");
        System.out.println("czekam");
    }
}