import java.util.Vector;

public class LibrarySystem{

    private static Vector<Book> books;

    public static void borrowBook(Student student, String book_name) {
        for (Book book : books) {
            if (book.getTitle().equals(book_name)) {
                if (book.getAvailable()) {
                    student.borrowBook(book);
                    book.setNotAvailable(); 
                    System.out.println("Book borrowed successfully.");
                    return;
                } else {
                    System.out.println("Sorry, the book is currently unavailable.");
                    return;
                }
            }
        }
        
        System.out.println("Sorry, the book is not found in the library.");

        return;
    }

    //more methods
}
