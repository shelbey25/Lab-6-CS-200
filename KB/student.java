public class student {
    private String name;
    private int studentID;
    private int gradeLevel;
    //borrowedBooks (list of books that the student has borrowed)
    private book[] borrowedBooks;

    //Getters and Setters
    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public book[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setBorrowedBooks(book[] borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
    public int getGradeLevel() {
        return gradeLevel;
    }
}
//branch: deviation of main branch linke an alternate timeline
//merge branch to main when we are ready
//branches created to make sure that changes that are made can be tested before merging to main branch
//before changes to branch, should just be master branch (* means current branch)
//git branch -m [branch new name] (to rename branch)
//git branch [branch name] (to create new branch)
//add anomther branch with feature using git branch [branch name]/[feature name]
//switch to other branch using git switch [branch name]
//use branches so that when multiple people are using the same file, 
// //   each person can push their own rendition of the file and merge into one common branch
//may need to fix conflicts
