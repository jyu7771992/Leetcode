package LeetCode.Q1;

public class Fiction extends Book implements iBorrowable{
    private int startDay;
    private int endDay;

    public Fiction() {
        super("HarryPotter", 200.00, "1990");
    }
    public Fiction(String title, Double price, String publishYear) {
        super(title, price, publishYear);
    }


    @Override
    public void setBorrowDate(int startDay) {
        this.startDay = startDay;
    }

    @Override
    public void setReturnDate(int endDay) {
        this.endDay = endDay;
    }
    @Override
    public boolean isAvailable(int day) {
        if(startDay <= day && day <= endDay){
            return true;
        }
        return false;
    }
    @Override
    public String description() {
        return this.title + "all events are imaginary and not based on real facts";
    }
}
