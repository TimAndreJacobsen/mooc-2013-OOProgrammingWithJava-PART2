import java.util.*;

public class Storehouse {

    private Map<String, Integer> productPriceMap; // productName , price
    private Map<String, Integer> productStockMap; // productName , stock

    public Storehouse() {
        this.productPriceMap = new HashMap<String, Integer>();
        this.productStockMap = new HashMap<String, Integer>();
    }

    // Adds productname, price and stock to respective HashMaps
    public void addProduct(String product, int price, int stock) {
        this.productPriceMap.put(product, price);
        this.productStockMap.put(product, stock);
    }


    /* Checks if HashMap key(productname) leads to a price value,
     * if true, return price.
     * else return -99(ie. product does not exist yet)          */
    public int price(String product) {
        if (productPriceMap.containsKey(product)) {
            return productPriceMap.get(product);
        }
        return -99;
    }


    /* Checks if product is in stock, if so returns amount.
     * If not in stock, return 0                                */
    public int stock(String product) {
        if (productStockMap.containsKey(product)) {
            return productStockMap.get(product);
        }
        return 0;
    }


    /* Checks if product exists and if stock is >0.
     * if it passes stock is reduced by one and returns true.
     * if it fails either check it just returns true            */
    public boolean take(String product) {
        if (productStockMap.get(product) != null &&productStockMap.get(product) > 0) {
            productStockMap.put(product, (productStockMap.get(product) - 1));
            return true;
        }
        return false;
    }


    /* This was harder than i thought, need more practice
     * Still don't know what is causing "unchecked assignement" --> Just discovered its lack of bracketing
     * for example Set<> setName = new HashSet<>(); = unchecked
     * BUT, Set<String> setName = new HashSet<>(); is valid, but TMC will throw(JDK 7 to blame?
     *          Set<String> setname = new HashSet<String>(); seems to be the safe option.
     * Not sure if backwards compatibility is an issue here, and what is the norm.                       */
    public Set<String> products() {
        Set<String> productNames = new HashSet<String>();

        for (String s : this.productPriceMap.keySet()) {
            productNames.add(s);
        }
        return productNames;
    }
}
