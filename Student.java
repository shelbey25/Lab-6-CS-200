import java.util.Vector;

public class Student{

    public int studentID;
    public String name;
    public Vector<Book> borrowedBooks;

    public Student(int studentID, String name){
        this.studentID = studentID;
        this.name = name;
        this.borrowedBooks = new Vector<Book>();
    }

    public boolean confirmIdentity(int studentID, String name) {
        if (this.studentID == studentID && this.name.equals(name)) {
            return true;
        }
        return false;
    }

    public void borrowBook(Book bookName) {
        borrowedBooks.add(bookName);
    }
 
}