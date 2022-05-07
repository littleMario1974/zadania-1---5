package com.company.device;

public class Phone extends Device {
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
}