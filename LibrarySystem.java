import java.util.Vector;
import java.util.Scanner;

/* 
Team Contributions:
    Shelbe Yousey - 12566098 - Wrote the main library system flow and helped implement borrowBook
    Charles Woods - 12144978 - Implemented the individual class declarations and brought them together.
    Tsion Shamsu - 12460874 - Setup group document and basic classes
    Jack Dean - 12207218- Added availability setting to book status, and wrote a rough radgh of class function grouop document.
    Michael Tesfaye - 12459837 - Provided feedback
    Chapman White - 12273039 - Provided feedback, attempted search functions
    Keylend Brooks - 12345572 - Provided feedback, base class system for Book, librarystem, and student. Worked on branches
*/

public class LibrarySystem {

    private static Vector<Book> books;
    private static Vector<Student> students;

    public static void main(String[] args) {
        books = new Vector<Book>();
        books.add(new Book("Java Basics", "JK Rowling", 123456, true));
        books.add(new Book("Advanced Java", "Bruce Lee", 654321, true));

        students = new Vector<Student>();
        students.add(new Student(1, "Mr. Amebley"));
        students.add(new Student(2, "Mr. King"));

        Student student1 = new Student(1, "Mr. Amebley");
        Student student2 = new Student(2, "Mr. King");

        LibrarySystem.borrowBook(student1, "Java Basics");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter username: ");
            String username = scanner.nextLine();

            System.out.println("\nEnter ID: ");
            String studentId = scanner.nextLine();

            boolean studentFound = false;

            for (Student student : students) {
                if (student.confirmIdentity(Integer.parseInt(studentId), username)) {
                    System.out.println("Welcome, " + student.getName() + "!");
                    studentFound = true;
                    break;
                }
            }

            if (!studentFound) {
                System.out.println("Invalid username or ID. Please try again.");
            } else {
                break;
            }
        }
        
        while (true) {
            System.out.println("\nEnter book name to borrow: ");
            String bookName = scanner.nextLine();

            if (bookName.equals("")) {
                System.out.println("Exiting the library system. Goodbye!");
                scanner.close();
                break;
            }

            LibrarySystem.borrowBook(student2, bookName);
        }
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
