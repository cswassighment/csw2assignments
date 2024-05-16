class Student {
    private String name;
    private Object rollNumber; 
    private int age;

    public Student(String name, Object rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
    }
}

public class Generics1_assn_Q1 {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 12345, 18);
        Student student2 = new Student("Bob", "A6789", 20);

        System.out.println("Details of Student 1:");
        student1.displayInfo();

        System.out.println("\nDetails of Student 2:");
        student2.displayInfo();
    }
}