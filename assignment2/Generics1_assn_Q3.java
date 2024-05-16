class Car implements Comparable<Car> {
    private String model;
    private String color;
    private double speed;

    public Car(String model, String color, double speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public String toString() {
        return "Model: " + model + ", Color: " + color + ", Speed: " + speed + " km/h";
    }

    
    public int compareTo(Car other) {
        return Double.compare(this.speed, other.speed);
    }
}

class CarDriver {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Red", 180.5);
        Car car2 = new Car("Honda", "Blue", 200.2);

        System.out.println("Details of Car 1: " + car1.toString());
        System.out.println("Details of Car 2: " + car2.toString());

        int comparison = car1.compareTo(car2);
        if (comparison < 0) {
            System.out.println("Car 2 is faster than Car 1.");
            System.out.println("Details of the faster car: " + car2.toString());
        } else if (comparison > 0) {
            System.out.println("Car 1 is faster than Car 2.");
            System.out.println("Details of the faster car: " + car1.toString());
        } else {
            System.out.println("Both cars have the same speed.");
        }
    }
}