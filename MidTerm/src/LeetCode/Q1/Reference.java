package LeetCode.Q1;

public class Reference extends Book{

    private String category;
    public String getCategory() {
        return category;
    }

    public Reference() {
        super("World Maps", 20.0, "1877");
    }

    public Reference(String title, Double price, String publishYear, String category) {
        super(title, price, publishYear);
        this.category = category;
    }


    @Override
    public String description() {
        return this.title + "all information is real.";
    }
}
