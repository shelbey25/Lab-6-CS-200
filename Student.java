import java.util.Vector;

public class Student{

    public int studentID;
    public String name;
    public Vector<String> borrowedBooks;

    public Student(int studentID, String name, Vector<String> borrowedBooks){
        this.studentID = studentID;
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }

    public boolean confirmIdentity(int studentID, String name) {
        if (this.studentID == studentID && this.name.equals(name)) {
            return true;
        }
        return false;
    }
}