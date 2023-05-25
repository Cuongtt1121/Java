package Thihetmon;

public class Book {
    String title;
    String author;
    Double price;
    public Book(String title, String author, Double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String toString(){
        return ("NameBook" + title + "Author" + author + "Price" + price);
    }
}
