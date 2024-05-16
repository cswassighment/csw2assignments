class Book {
    private int bookId;
    private String bookName;
    private double price;

    public Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public String toString() {
        return "Book ID: " + bookId + ", Book Name: " + bookName + ", Price: $" + price;
    }

    public boolean equals(Book other) {
        return this.price == other.price;
    }

    public int compareTo(Book other) {
        return Double.compare(this.price, other.price);
    }
}

class BookDriver {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Book 1", 20.5);
        Book book2 = new Book(2, "Book 2", 15.75);

        System.out.println("Details of Book 1: " + book1.toString());
        System.out.println("Details of Book 2: " + book2.toString());

        if (book1.equals(book2)) {
            System.out.println("Both books have the same price.");
        } else {
            System.out.println("The prices of the books are different.");
        }

        int comparison = book1.compareTo(book2);
        if (comparison < 0) {
            System.out.println("Book 1 is cheaper than Book 2.");
        } else if (comparison > 0) {
            System.out.println("Book 1 is more expensive than Book 2.");
        } else {
            System.out.println("Both books have the same price.");
        }
    }
}