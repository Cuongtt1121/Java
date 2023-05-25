package Baitap12;

import java.util.ArrayList;

public class News implements INews{
    int ID;
    String Title;
    String PublishDate;
    String Author;
    String Content;
    float AverageRate;
    ArrayList<Integer> rateList;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    @Override
    public void Display() {
        System.out.println("Title" + Title);
        System.out.println("pulish date" + PublishDate);
        System.out.println("Content" + Content);
        System.out.println("");
    }
}
