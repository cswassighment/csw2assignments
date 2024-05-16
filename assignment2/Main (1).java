package Vehicles;

import java.util.*;

interface Vehicle {
    public abstract void acclerate();

    public abstract void brake();
}

class Car implements Vehicle {
    public void acclerate() {
        System.out.println("Car is accelerating..");
    }

    public void brake() {
        System.out.println("Car's brakes are applied..");
    }

    public void acclerate(int gear) {
        System.out.println("Car is accelerating in " + gear + " gear");
    }
}

class Bicycle implements Vehicle {
    public void acclerate() {
        System.out.println("Bicycle is accelerating.");
    }

    public void brake() {
        System.out.println("Bicycle's brakes are applied..");
    }

    public void acclerate(int duration) {
        System.out.println("Bicycle is acclerated for " + duration + " minutes");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car c1 = new Car();
        c1.acclerate();
        c1.brake();
        System.out.println("In which gear do you want to accelarte the car (1-6): ");
        int gear = sc.nextInt();
        if (gear < 7 || gear > 0) {
            c1.acclerate(gear);
        } else {
            System.out.println("Invalid gear!!");
        }
        System.out.println();
        Bicycle b1 = new Bicycle();
        b1.acclerate();
        b1.brake();
        System.out.println("Enter the duration for which you want to acclerate the bicycle: ");
        int duration = sc.nextInt();
        b1.acclerate(duration);
    }
}
