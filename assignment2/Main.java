package CollegemanagementSystem;

import java.util.*;

class College {
    private String collegeName;
    private String collegeLOC;

    public College(String name, String Loc) {
        this.collegeName = name;
        this.collegeLOC = Loc;
    }

    public void setCollegeName(String n) {
        this.collegeName = n;
    }

    public void setCollegeLoc(String l) {
        this.collegeLOC = l;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getCollegeLoc() {
        return collegeLOC;
    }
}

class Student extends College {
    private long StudentId;
    private String StudentName;

    public Student(String collegeName, String collegeLOC, long id, String name) {
        super(collegeName, collegeLOC);
        this.StudentId = id;
        this.StudentName = name;
    }

    public void setStudentId(long id) {
        this.StudentId = id;
    }

    public void setStudentName(String n) {
        this.StudentName = n;
    }

    public void displayStudentInfo() {
        System.out.println("Student's details: ");
        System.out.println("Name: " + StudentName);
        System.out.println("ID: " + StudentId);
        System.out.println("Collge name: " + getCollegeName());
        System.out.println("College name: " + getCollegeLoc());
    }
}

public class Main {
    public static void main(String[] args) {
        College c1 = new College("Iter, Soa", "Khandagiri, Bhubaneswar");
        College c2 = new College("Nit Jamshedpur", "Jamshedpur, Jharkhand");
        Student s1 = new Student(c1.getCollegeName(), c1.getCollegeLoc(), 2241019377l, "Suraj Senapati");
        Student s2 = new Student(c2.getCollegeName(), c2.getCollegeLoc(), 2164164, "Somesh Ghosh");
        s1.displayStudentInfo();
        System.out.println();
        s2.displayStudentInfo();
    }
}
