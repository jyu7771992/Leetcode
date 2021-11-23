package Strategy;

public class Item extends ShoppingCart{
    private  String item_id;
    private Integer item_price;

    public Item(String item_id, int item_price) {
        this.item_id = item_id;
        this.item_price = item_price;
    }
    public String getId(){
        return item_id;
    }
    public int getPrice(){
        return item_price;
    }
}
