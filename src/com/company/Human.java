package com.company;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    Boolean isAlive;

    Phone mobile;
    Animal pet;
    private Car car;
    private Double salary;
    public Car getCar(){
        return this.car;
    }

    public void setCar(Car car){
        if (this.salary > car.value) {
            System.out.println("gratulacje, stać cię na samochód " + car.model);
            this.car = car;
    } else if(this.salary > car.value / 12.0){
            System.out.println("kupiłeś na kredyt samochód " + car.model);
}  else {
            System.out.println("Zbieraj kasę i potem kup");
        }

    public Double getSalary(){
        System.out.println("Dane o wypłacie były pobrane: " + java.time.LocalDateTime.now());
        return this.salary;

    }
}
