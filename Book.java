public class Book{

    private String title;
    private String author;
    private int ISBN;
    private boolean isAvailable;

    public Book(String title, String author, int ISBN, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    public String getTitle(){
        return title;
    }

    public boolean getAvailable(){
        return isAvailable;
    }
    
    public boolean setAvailable(){
        this.isAvailable=true;
    }
    
    public boolean setNotAvailable(){
        this.isAvailable=false;
    }
    
}
