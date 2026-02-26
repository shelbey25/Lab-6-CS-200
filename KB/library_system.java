public class library_system {
    public static void main(String[] args) throws Exception {
        
        //Student Classes

        student MrAmebley = new student();
        MrAmebley.name = "Mr. Amebley";
        MrAmebley.studentID = 91021;

        student MrKing = new student();
        MrKing.name = "Mr. King";
        MrKing.studentID = 67670;
        
        //System.out.println("Mr. Amebley's student ID is: " + MrAmebley.studentID);
        
        //Book Classes
        book Java_Basics = new book();
        Java_Basics.title = "Java Basics";
        Java_Basics.author = "John Doe";
        Java_Basics.ISBN = "2";
        Java_Basics.isAvailable = true;

        book Adv_Java = new book();
        Adv_Java.title = "Advanced Java";
        Adv_Java.author = "Jane Smith";
        Adv_Java.ISBN = "1";
        Adv_Java.isAvailable = true;

        //Mr. Amebley borrows Basics
        if (Java_Basics.isAvailable) {
            Java_Basics.isAvailable = false;
            MrAmebley.borrowedBooks = new book[1];
            MrAmebley.borrowedBooks[0] = Java_Basics;
            System.out.println(MrAmebley.name + " borrowed " + Java_Basics.title);
        } else {
            System.out.println(Java_Basics.title + " is not available.");
        }

        //Mr. King tries to borrow Advanced
        if (Adv_Java.isAvailable) {
            Adv_Java.isAvailable = false;
            MrKing.borrowedBooks = new book[1];
            MrKing.borrowedBooks[0] = Adv_Java;
            System.out.println(MrKing.name + " borrowed " + Adv_Java.title);
        } else {
            System.out.println(Adv_Java.title + " is not available.");
        }


    }

}
