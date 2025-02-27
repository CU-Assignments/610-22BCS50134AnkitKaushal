import java.util.Scanner;

class Book {
    protected String title;
    protected String author;
    protected double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }
}

class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter details for Fiction Book:");
        System.out.print("Title: ");
        String fictionTitle = scanner.nextLine();
        System.out.print("Author: ");
        String fictionAuthor = scanner.nextLine();
        System.out.print("Price: ");
        double fictionPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        
        System.out.println("Enter details for Non-Fiction Book:");
        System.out.print("Title: ");
        String nonFictionTitle = scanner.nextLine();
        System.out.print("Author: ");
        String nonFictionAuthor = scanner.nextLine();
        System.out.print("Price: ");
        double nonFictionPrice = scanner.nextDouble();
        scanner.close();
        
        Fiction fiction = new Fiction(fictionTitle, fictionAuthor, fictionPrice);
        NonFiction nonFiction = new NonFiction(nonFictionTitle, nonFictionAuthor, nonFictionPrice);
        
        System.out.println("\nFiction Book Details:");
        fiction.displayDetails();
        System.out.println("\nNon-Fiction Book Details:");
        nonFiction.displayDetails();
    }
}
