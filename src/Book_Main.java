class Book {
    String title;
    String author;
    int price;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;

    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;

    }


} public class Book_Main {
            public static void main(String[] args) {
                Book N1 = new Book ("Harry Potter", "Rowling");
                Book N2 = new Book ("The Alchemist" , "Paulo", 60);
                System.out.println("Title is: " + N1.title + "\nAuthor is: " + N1.author);
                System.out.println("Title is: " + N2.title + "\nAuthor is: " + N2.author + "\nPrice is: " + N2.price);
            }
        }





