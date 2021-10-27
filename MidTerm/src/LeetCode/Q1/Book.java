package LeetCode.Q1;

public abstract class Book {
    public String title;
    public Double price;
    public String publishYear;
    private int startDay;
    private int endDay;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public String getPublishYear() {
        return publishYear;
    }
    public Book(String title, Double price, String publishYear){
        this.title = title;
        this.price = price;
        this.publishYear = publishYear;
    }

    public boolean isAvailable(int day) {
        if(startDay <= day && day <= endDay){
            return true;
        }
        return false;
    }
    public String toString(){
        return "Book name = " + this.title + "Price = " + this.price + " PublishYear= " + this.publishYear;
    };
    public abstract String description();
}
