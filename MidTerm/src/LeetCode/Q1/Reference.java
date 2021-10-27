package LeetCode.Q1;

public class Reference extends Book{

    public String category = "dictionaries";
    public String getCategory() {
        return category;
    }

    public Reference() {
        super("World Maps", 20.0, "1877");
    }

    public Reference(String title, Double price, String publishYear) {
        super(title, price, publishYear);
    }


    @Override
    public String description() {
        return this.title + "all information is real.";
    }
}
