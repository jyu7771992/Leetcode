package LeetCode.Q1;

public class NonFiction extends Book implements iBorrowable{
    private int StartDay;
    private int endDay;

    public NonFiction() {
        super("Anne Frank", 40.00, "1994");
    }
    public NonFiction(String title, Double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public void setBorrowDate(int StartDay) {
        this.StartDay = StartDay;
    }

    @Override
    public void setReturnDate(int endDay) {
        this.endDay = endDay;
    }

    @Override
    public boolean isAvailable(int day) {
        if(StartDay <= day && day <= endDay){
            return true;
        }
        return false;
    }

    @Override
    public String description() {
        return this.title + "all events are true and based on real facts.";
    }

}
