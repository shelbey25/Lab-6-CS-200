public class Student{

    public int studentID;
    public String name;
    public Vector<String> borrowedBooks;

    public Student(int studentID, String name, Vector<String> borrowedBooks){
        this.studentID = studentID;
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }
}