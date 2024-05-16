package LibraryManagementSystem;

import java.util.*;

abstract class LibraryResource {
    private String title;
    private String author;

    public LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract void displayDetails();
}

class Book extends LibraryResource {
    private int PageCount;

    public Book(String title, String author, int pagecount) {
        super(title, author);
        this.PageCount = pagecount;
    }

    public void setPageCount(int pagecount) {
        this.PageCount = pagecount;
    }

    public int getPageCount() {
        return PageCount;
    }

    public void displayDetails() {
        System.out.println("Book Details: ");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("PageCount: " + getPageCount());
    }
}

class Magazine extends LibraryResource {
    private String IssueDate;

    public Magazine(String title, String author, String issueDate) {
        super(title, author);
        this.IssueDate = issueDate;
    }

    public String getIssueDate() {
        return IssueDate;
    }

    public void setIssueDate(String issuedate) {
        this.IssueDate = issuedate;
    }

    public void displayDetails() {
        System.out.println("Magazine details: ");
        System.out.println("Title: " + getTitle());
        System.out.println("Auhtor: " + getAuthor());
        System.out.println("IssueDate: " + getIssueDate());
    }
}

class DVD extends LibraryResource {
    private int duration;

    public DVD(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("DVD details: ");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Duration: " + getDuration() + " hours");

    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book("Linear Algebra", "Gilbert Strang ", 488);
        Magazine m1 = new Magazine("Champak", "Suraj", "12/03/2024");
        DVD d1 = new DVD("Harry Potter", "J.K Rowling", 2);
        b1.displayDetails();
        System.out.println();
        m1.displayDetails();
        System.out.println();
        d1.displayDetails();
    }
}
