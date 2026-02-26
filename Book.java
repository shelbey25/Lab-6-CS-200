public class Book{

    public String title;
    public String author;
    public int ISBN;
    public boolean isAvailable;

    public Book(String title, String author, int ISBN, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    public String getTitle(){
        return title;
    }

    public boolean isAvailable(){
        return isAvailable;
    }
}