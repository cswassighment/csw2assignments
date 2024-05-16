import java.util.*;

// Interface for Enrollment System
interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);

    void dropStudent(Student student, Course course);

    void displayEnrollmentDetails();
}

// Student class
class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

// Course class
class Course {
    private String name;
    private int courseId;

    public Course(String name, int courseId) {
        this.name = name;
        this.courseId = courseId;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public int getCourseId() {
        return courseId;
    }
}

// Enrollment class
class Enrollment implements EnrollmentSystem {
    private List<Student> enrolledStudents;
    private List<Course> enrolledCourses;

    public Enrollment() {
        this.enrolledStudents = new ArrayList<>();
        this.enrolledCourses = new ArrayList<>();
    }

    @Override
    public void enrollStudent(Student student, Course course) {
        enrolledStudents.add(student);
        enrolledCourses.add(course);
        System.out.println(student.getName() + " enrolled in " + course.getName());
    }

    @Override
    public void dropStudent(Student student, Course course) {
        int index = enrolledStudents.indexOf(student);
        if (index != -1 && enrolledCourses.get(index).equals(course)) {
            enrolledStudents.remove(index);
            enrolledCourses.remove(index);
            System.out.println(student.getName() + " dropped from " + course.getName());
        } else {
            System.out.println(student.getName() + " is not enrolled in " + course.getName());
        }
    }

    @Override
    public void displayEnrollmentDetails() {
        System.out.println("Enrollment Details:");
        for (int i = 0; i < enrolledStudents.size(); i++) {
            System.out
                    .println(enrolledStudents.get(i).getName() + " is enrolled in " + enrolledCourses.get(i).getName());
        }
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        EnrollmentSystem enrollmentSystem = new Enrollment();

        Student student1 = new Student("Suraj Senapati", 9377);
        Student student2 = new Student("Abhishek Kr. Sharma", 9393);

        Course course1 = new Course("COA", 2211);
        Course course2 = new Course("CSW-2", 1021);

        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course2);

        enrollmentSystem.displayEnrollmentDetails();

        enrollmentSystem.dropStudent(student1, course1);

        enrollmentSystem.displayEnrollmentDetails();
    }
}
