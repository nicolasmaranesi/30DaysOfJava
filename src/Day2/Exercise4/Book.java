package Day2.Exercise4;

public class Book {
    private String author;
    private String title;
    private int  publish;

    public void Book(String author, String title, int publish){
        this.author = author;
        this.title = title;
        this.publish = publish;
    }

    public int getPublish() {
        return publish;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public void printBookData(){
        System.out.println("The book " + title + " was written by "+ author + " and was published in " + publish);
    }
}
