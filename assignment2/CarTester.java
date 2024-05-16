import java.util.*;

class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setMake(String m) {
        this.make = m;
    }

    public void setModel(String m) {
        this.model = m;
    }
}

public class CarTester {
    public static void main(String[] args) {
        Car myCar1 = new Car("Honda Civic", "R+");
        Car myCar2 = new Car("Tata Nexon", "Xz+");
        System.out.println("Car's Model: " + myCar1.getModel() + " and  Make: " + myCar1.getMake());
        System.out.println("Car's Model: " + myCar2.getModel() + " and  Make: " + myCar2.getMake());
        myCar2.setMake("Z");
        myCar2.setModel("Hyundai Creta");
        System.out.println("Car's Model after changing: " + myCar2.getModel() + " and Make: " + myCar2.getMake());

    }
}
