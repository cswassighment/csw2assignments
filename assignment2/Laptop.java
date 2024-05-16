import java.util.*;

public class Laptop {
    private String model;
    private double price;

    public Laptop(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public void setModel(String m) {
        this.model = m;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Laptop details: \n" +
                "Model: " + model + "\n" +
                "Price: " + price;
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop(null, 45999);
        l1.setModel("Asus");
        System.out.println(l1.toString());
    }
}
