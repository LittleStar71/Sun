package pojo;

import java.util.Date;

public class Library
{
    private int id;
    private String book;
    private String author;
    private Date date;
    private Double price;
    private String type;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBook() {
        return book;
    }
    public void setBook(String book) {
        this.book = book;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", book='" + book + '\'' +
                ", author='" + author + '\'' +
                ", date=" + date +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
