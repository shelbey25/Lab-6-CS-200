import java.util.Vector;

public class LibrarySystem{

    private static Vector<Book> books;

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

    //more methods
}
