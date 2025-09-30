abstract class Book {

    protected String name;
    protected String author;
    protected String price;

    public Book(String name, String author, String price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public abstract String getDetails();
}


class MyBook extends Book {

    public MyBook(String name, String author, String price) {
        super(name, author, price);
    }

    @Override
    public String getDetails() {
        return this.name + ", " + this.author + ", " + this.price;
    }
}

public class MyJavaApp {
    public static void main(String[] args) {
        Book myBook = new MyBook("Harry Potter", "J.k Rowling", "100");

        System.out.println(myBook.getDetails());
    }
}