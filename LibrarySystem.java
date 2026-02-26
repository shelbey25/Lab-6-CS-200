import java.util.Vector;

public class LibrarySystem {

    private static Vector<Book> books;

    public static void main(String[] args) {
        books = new Vector<Book>();
        books.add(new Book("Java Basics", "JK Rowling", 123456, true));
        books.add(new Book("Advanced Java", "Bruce Lee", 654321, true));

         Student student1 = new Student(1, "Mr. Amebley");
         Student student2 = new Student(2, "Mr. King");

         LibrarySystem.borrowBook(student1, "Java Basics");
         LibrarySystem.borrowBook(student2, "Java Basics");
         LibrarySystem.borrowBook(student2, "Advanced Java");
    }

    public static void borrowBook(Student student, String book_name) {
        for (Book book : books) {
            if (book.getTitle().equals(book_name)) {
                if (book.getAvailable()) {
                    student.borrowBook(book);
                    book.setNotAvailable(); 
                    System.out.println(student.getName() + " borrowed " + book.getTitle() + ".");
                    return;
                } else {
                    System.out.println(book.getTitle() + " is not available.");
                    return;
                }
            }
        }
        
        System.out.println("Sorry, this book was not found in the library.");

        return;
    }
}
