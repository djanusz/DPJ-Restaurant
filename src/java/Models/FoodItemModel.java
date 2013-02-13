
package Models;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: This class is responsible for the food item data. 
 * @author David Janusz
 */
public class FoodItemModel {

    private double price;
    private final Map<String, Double> items = new HashMap<String, Double>();
    private final String NPE_MSG = "No menu item passed to FoodItemModel.";
    private final String IAE_MSG = "Item string not found.";

    /**
     * FoodItemModel constructor that fills the HashMap with menu items.
     */
    public FoodItemModel() {
        items.put("Steak", 15.00);
        items.put("Lobster", 20.00);
        items.put("Veal", 25.00);
        items.put("Potato", 5.50);
        items.put("Tomato", 4.50);
        items.put("House", 6.50);
        items.put("Cesar", 7.50);
        items.put("Cesar", 7.00);
        items.put("Mashed", 5.00);
        items.put("Baked", 6.25);
        items.put("Vegetables", 4.00);
        items.put("Beer", 6.00);
        items.put("Wine", 12.00);
        items.put("Milk", 2.00);
        items.put("Soda",2.25);
    }

    /**
     * Gets the price from the HashMap.
     * @param item is a food item from he HashMap
     * @return price
     */
    public double getPrice(String item) {
        try {
        price = items.get(item);
        } catch(NullPointerException npe) {
            System.out.println(NPE_MSG);
        } catch(IllegalArgumentException iae) {
            System.out.println(IAE_MSG);
        }
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FoodItemModel{" + "price=" + price + ", items=" + items + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 47 * hash + (this.items != null ? this.items.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FoodItemModel other = (FoodItemModel) obj;
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (this.items != other.items && (this.items == null || !this.items.equals(other.items))) {
            return false;
        }
        return true;
    }
}
