/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class FoodBillModel {
    private FoodItemModel item;
    private List<String> itemList;
    private List<String> lineItems;
    private String itemName;
    private double itemPrice;
    private double subtotal;
    private double tax;
    private double total;
    private double suggestedTip;
    private double grandTotal;
    private final double SALES_TAX = 0.055;
    private final double SUGGESTED_GRATUITY_PERCENTAGE = 0.15;
    

    public FoodBillModel(List<String> itemList) {
        item = new FoodItemModel();
        if (itemList.isEmpty()) {
            throw new NullPointerException("No items passed from servlet.");
        }
        this.itemList = itemList;
    }

    private List<String> getItemList() {
        return itemList;
    }

    private void setItemList(List<String> itemList) {
        this.itemList = itemList;
    }

    private String getItemName() {
        return itemName;
    }

    private void setItemName(String itemName) {
        this.itemName = itemName;
    }

    private double getItemPrice(String itemName) {
        return itemPrice;
    }

    private void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public List<String> getLineItems() {
        lineItems = new ArrayList();
        for (String s: itemList) {
            lineItems.add(s + " . . . " + item.getPrice(s));
        }
        return lineItems;
    }
    
    public double getSubtotal() {
        subtotal = 0;
        for (String s: itemList) {
            
            subtotal = subtotal + item.getPrice(s);
        }
        return subtotal;
    }

    private void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTax() {
        tax = getSubtotal() * SALES_TAX;
        return tax;
    }

    private void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotal() {
        total = getSubtotal() + getTax();
        return total;
    }

    private void setTotal(double total) {
        this.total = total;
    }

    public double getSuggestedTip() {
        suggestedTip = getTotal() * SUGGESTED_GRATUITY_PERCENTAGE;
        return suggestedTip;
    }

    private void setSuggestedTip(double suggestedTip) {
        this.suggestedTip = suggestedTip;
    }

    public double getGrandTotal() {
        grandTotal = getTotal() + getSuggestedTip();
        return grandTotal;
    }

    private void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.item != null ? this.item.hashCode() : 0);
        hash = 67 * hash + (this.itemList != null ? this.itemList.hashCode() : 0);
        hash = 67 * hash + (this.itemName != null ? this.itemName.hashCode() : 0);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.itemPrice) ^ (Double.doubleToLongBits(this.itemPrice) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.subtotal) ^ (Double.doubleToLongBits(this.subtotal) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.tax) ^ (Double.doubleToLongBits(this.tax) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.total) ^ (Double.doubleToLongBits(this.total) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.suggestedTip) ^ (Double.doubleToLongBits(this.suggestedTip) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.grandTotal) ^ (Double.doubleToLongBits(this.grandTotal) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "FoodBillModel{" + "item=" + item + ", itemList=" + itemList + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", subtotal=" + subtotal + ", tax=" + tax + ", total=" + total + ", suggestedTip=" + suggestedTip + ", grandTotal=" + grandTotal + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FoodBillModel other = (FoodBillModel) obj;
        if (this.item != other.item && (this.item == null || !this.item.equals(other.item))) {
            return false;
        }
        if (this.itemList != other.itemList && (this.itemList == null || !this.itemList.equals(other.itemList))) {
            return false;
        }
        if ((this.itemName == null) ? (other.itemName != null) : !this.itemName.equals(other.itemName)) {
            return false;
        }
        if (Double.doubleToLongBits(this.itemPrice) != Double.doubleToLongBits(other.itemPrice)) {
            return false;
        }
        if (Double.doubleToLongBits(this.subtotal) != Double.doubleToLongBits(other.subtotal)) {
            return false;
        }
        if (Double.doubleToLongBits(this.tax) != Double.doubleToLongBits(other.tax)) {
            return false;
        }
        if (Double.doubleToLongBits(this.total) != Double.doubleToLongBits(other.total)) {
            return false;
        }
        if (Double.doubleToLongBits(this.suggestedTip) != Double.doubleToLongBits(other.suggestedTip)) {
            return false;
        }
        if (Double.doubleToLongBits(this.grandTotal) != Double.doubleToLongBits(other.grandTotal)) {
            return false;
        }
        return true; 
    }
    
//    public static void main(String[] args) {
//        List<String> items = new ArrayList<String>();
//        items.add("Steak");
//        items.add("Beer");
//        
//        FoodBillModel bill = new FoodBillModel(items);
//        double subTot =  bill.getSubtotal();
//        System.out.println(subTot);
        
        
//    }
    
}
