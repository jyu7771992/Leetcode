package Strategy;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Item> items;

    public ShoppingCart(){
        items = new ArrayList<>();
    }
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }
    public int calculateTotal(){
        int sum = 0;
        for(Item i : items){
            sum += i.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(this.calculateTotal());
    }
}
