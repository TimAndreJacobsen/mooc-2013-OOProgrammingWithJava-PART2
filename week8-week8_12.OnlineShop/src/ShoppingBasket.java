import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    private Map<String,Purchase> itemsInBasket;

    public ShoppingBasket() {
        this.itemsInBasket = new HashMap<String,Purchase>();
    }

    public void add(String product, int price) {
        if (this.itemsInBasket.containsKey(product)) {
            this.itemsInBasket.get(product).increaseAmount();

        } else {
            this.itemsInBasket.put(product, new Purchase(product, 1, price));
        }
    }

    public int price() {
        int totalPrice = 0;
        for (String s : itemsInBasket.keySet())
        {
            totalPrice += itemsInBasket.get(s).price();
        }
        return totalPrice;
    }

    public void print() {
        for (String s : itemsInBasket.keySet()) {
            System.out.println(itemsInBasket.get(s));
        }
    }

}
